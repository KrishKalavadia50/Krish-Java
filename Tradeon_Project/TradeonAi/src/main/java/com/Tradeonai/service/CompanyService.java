package com.Tradeonai.service;

import com.Tradeonai.model.Company;
import com.Tradeonai.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String UPLOAD_DIR = "uploads/";

    public void registerCompany(Company company, MultipartFile logoFile, MultipartFile sqlFile) throws IOException {
        String loginId = "TRAD-" + UUID.randomUUID().toString().substring(0, 8);
        company.setLoginId(loginId);

        String logoPath = saveFile(logoFile, "logos");
        String sqlFilePath = saveFile(sqlFile, "sql_files");

        if (logoPath != null && !logoPath.isEmpty()) {
            company.setLogoPath(logoPath);
        }
        if (sqlFilePath != null && !sqlFilePath.isEmpty()) {
            company.setSqlFilePath(sqlFilePath);
            executeSqlFile(sqlFilePath);
        }

        companyRepository.save(company);
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyByEmail(String email) {
        return companyRepository.findByEmail(email);
    }

    private String saveFile(MultipartFile file, String folder) throws IOException {
        if (file == null || file.isEmpty()) {
            return null;
        }

        String directoryPath = UPLOAD_DIR + folder;
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        Path filePath = Paths.get(directoryPath, fileName);
        Files.write(filePath, file.getBytes());

        return filePath.toString().replace("\\", "/");
    }

    private void executeSqlFile(String sqlFilePath) {
        try {
            File sqlFile = new File(sqlFilePath);
            BufferedReader reader = new BufferedReader(new FileReader(sqlFile));
            StringBuilder sqlQuery = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sqlQuery.append(line).append(" ");
            }
            reader.close();

            jdbcTemplate.execute(sqlQuery.toString());
            System.out.println("✅ SQL file executed successfully for: " + sqlFilePath);
        } catch (Exception e) {
            System.err.println("❌ Error executing SQL file: " + e.getMessage());
        }
    }

    public List<Map<String, Object>> getStockData(String sqlFilePath) {
        String query = "SELECT * FROM stocks";
        return jdbcTemplate.queryForList(query);
    }
}
