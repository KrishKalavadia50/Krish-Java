package com.stockbroker.dashboard.service;

import com.stockbroker.dashboard.model.Company;
import com.stockbroker.dashboard.repository.CompanyRepository;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final CompanyRepository companyRepository;
    private final JavaMailSender mailSender;

    @Value("${file.upload-dir}")
    private String uploadDir;

    private final Map<String, String> otpStore = new HashMap<>();

    // Register Company
    public void registerCompany(String companyName, String email, String phoneNumber,
                                String password, MultipartFile sqlFile, MultipartFile companyLogo)
            throws IOException, MessagingException {

        // Save files
        String sqlFilePath = saveFile(sqlFile, "sql_files");
        String logoFilePath = saveFile(companyLogo, "logos");

        // Save to Database
        Company company = new Company();
        company.setCompanyName(companyName);
        company.setEmail(email);
        company.setPhoneNumber(phoneNumber);
        company.setPassword(password);
        company.setSqlFilePath(sqlFilePath);
        company.setLogoUrl(logoFilePath);

        companyRepository.save(company);

        // Send Verification Email with OTP
        String otp = generateOtp();
        otpStore.put(email, otp);
        sendOtpEmail(email, otp);
    }

    // Login Method
    public boolean login(String email, String password) {
        Company company = companyRepository.findByEmail(email);
        return company != null && company.getPassword().equals(password);
    }

    // Verify OTP
    public boolean verifyOtp(String email, String otp) {
        if (otpStore.containsKey(email) && otpStore.get(email).equals(otp)) {
            otpStore.remove(email); // OTP is single-use
            return true;
        }
        return false;
    }

    // Save File Utility
    private String saveFile(MultipartFile file, String subDirectory) throws IOException {
        if (file.isEmpty()) {
            throw new IOException("File is empty: " + file.getOriginalFilename());
        }

        String dirPath = uploadDir + File.separator + subDirectory;
        Files.createDirectories(Paths.get(dirPath));  // Create directory if not exists

        String filePath = dirPath + File.separator + file.getOriginalFilename();
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(file.getBytes());
        }
        return filePath;
    }

    // Generate OTP Utility
    private String generateOtp() {
        SecureRandom random = new SecureRandom();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

    // Send OTP Email Utility
    private void sendOtpEmail(String toEmail, String otp) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo(toEmail);
        helper.setSubject("Your OTP for StockBroker Dashboard");
        helper.setText("<h1>Your OTP is: " + otp + "</h1>" +
                        "<p>Please use this OTP to verify your account. It will expire in 5 minutes.</p>",
                true);
        mailSender.send(message);
        System.out.println("OTP Email sent to: " + toEmail);
    }
}