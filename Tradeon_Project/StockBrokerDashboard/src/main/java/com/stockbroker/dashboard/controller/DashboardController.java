package com.stockbroker.dashboard.controller;

import com.stockbroker.dashboard.model.StockData;
import com.stockbroker.dashboard.service.PDFGeneratorService;
import com.stockbroker.dashboard.service.StockDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayInputStream;
import java.util.List;

@RestController
@RequestMapping("/api/dashboard")
@RequiredArgsConstructor
public class DashboardController {

    private final StockDataService stockDataService;
    private final PDFGeneratorService pdfGeneratorService;

    // Get All Stock Data
    @GetMapping("/stocks")
    public ResponseEntity<List<StockData>> getAllStocks() {
        List<StockData> stocks = stockDataService.getAllStockData();
        return new ResponseEntity<>(stocks, HttpStatus.OK);
    }

    // Get Stock Data by ID
    @GetMapping("/stocks/{id}")
    public ResponseEntity<StockData> getStockById(@PathVariable Long id) {
        return stockDataService.getStockDataById(id)
                .map(stock -> new ResponseEntity<>(stock, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Delete Stock Data
    @DeleteMapping("/stocks/{id}")
    public ResponseEntity<String> deleteStockById(@PathVariable Long id) {
        if (stockDataService.getStockDataById(id).isPresent()) {
            stockDataService.deleteStockData(id);
            return new ResponseEntity<>("Stock data deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Stock data not found", HttpStatus.NOT_FOUND);
        }
    }

    // Generate PDF Report
    @GetMapping("/generate-report")
    public ResponseEntity<byte[]> generatePDFReport() {
        ByteArrayInputStream pdf = pdfGeneratorService.generateStockReport();

        if (pdf == null) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=stock-report.pdf");

        return ResponseEntity.ok().headers(headers).body(pdf.readAllBytes());
    }
}
