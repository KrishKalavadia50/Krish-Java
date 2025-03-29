package com.stockbroker.dashboard.controller;

import com.stockbroker.dashboard.service.AuthService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> registerCompany(@RequestParam("companyName") String companyName,
                                                  @RequestParam("email") String email,
                                                  @RequestParam("phoneNumber") String phoneNumber,
                                                  @RequestParam("password") String password,
                                                  @RequestParam("sqlFile") MultipartFile sqlFile,
                                                  @RequestParam("companyLogo") MultipartFile companyLogo) {
        try {
            authService.registerCompany(companyName, email, phoneNumber, password, sqlFile, companyLogo);
            return ResponseEntity.status(HttpStatus.CREATED).body("Company registered successfully!");
        } catch (IOException | MessagingException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam("email") String email,
                                        @RequestParam("password") String password) {
        if (authService.login(email, password)) {
            return ResponseEntity.ok("Login successful!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }

    @PostMapping("/verify-otp")
    public ResponseEntity<String> verifyOtp(@RequestParam("email") String email,
                                            @RequestParam("otp") String otp) {
        if (authService.verifyOtp(email, otp)) {
            return ResponseEntity.ok("OTP verified successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid OTP");
        }
    }
}
