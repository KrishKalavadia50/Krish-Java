package com.stockbroker.dashboard.service;

import com.stockbroker.dashboard.model.Company;
import com.stockbroker.dashboard.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company registerCompany(Company company, MultipartFile sqlFile) {
        try {
            // Read SQL file content (for illustration, logging purpose)
            BufferedReader reader = new BufferedReader(new InputStreamReader(sqlFile.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder sqlContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sqlContent.append(line).append("\n");
            }
            System.out.println("SQL File Content: " + sqlContent);

            // Save company details
            return companyRepository.save(company);
        } catch (Exception e) {
            throw new RuntimeException("Failed to register company: " + e.getMessage());
        }
    }

    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }
}
