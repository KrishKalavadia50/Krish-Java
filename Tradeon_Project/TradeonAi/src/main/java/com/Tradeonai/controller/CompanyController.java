package com.Tradeonai.controller;

import com.Tradeonai.model.Company;
import com.Tradeonai.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/companies")
public class CompanyController {

    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerCompany(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("phone") String phone,
            @RequestParam("gstNumber") String gstNumber,
            @RequestParam("logo") MultipartFile logoFile,
            @RequestParam("sqlFile") MultipartFile sqlFile) {

        try {
            if (logoFile.isEmpty() || sqlFile.isEmpty()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("⚠️ Both Logo and SQL files are required!");
            }

            Company company = new Company();
            company.setName(name);
            company.setEmail(email);
            company.setPassword(password);
            company.setPhone(phone);
            company.setGstNumber(gstNumber);

            companyService.registerCompany(company, logoFile, sqlFile);

            return ResponseEntity.ok("✅ Company registered successfully!");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("❌ File processing error: " + e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies() {
        return ResponseEntity.ok(companyService.getAllCompanies());
    }

    @GetMapping("/{email}")
    public ResponseEntity<Company> getCompanyByEmail(@PathVariable String email) {
        return ResponseEntity.ok(companyService.getCompanyByEmail(email));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String email, @RequestParam String loginId) {
        Company company = companyService.getCompanyByEmail(email);

        if (company != null && company.getLoginId().equals(loginId)) {
            return ResponseEntity.ok().body(Map.of(
                    "message", "✅ Login successful",
                    "logoUrl", company.getLogoPath(),
                    "companyName", company.getName()
            ));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("❌ Invalid credentials");
        }
    }

    @GetMapping("/{email}/stock-data")
    public ResponseEntity<?> getCompanyStockData(@PathVariable String email) {
        Company company = companyService.getCompanyByEmail(email);
        if (company == null || company.getSqlFilePath() == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("❌ Company not found or no SQL file available.");
        }

        List<Map<String, Object>> stockData = companyService.getStockData(company.getSqlFilePath());
        return ResponseEntity.ok(stockData);
    }
}