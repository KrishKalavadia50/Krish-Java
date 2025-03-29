package com.stockbroker.dashboard.service;

import com.stockbroker.dashboard.model.StockData;
import com.stockbroker.dashboard.repository.StockDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockDataService {

    private final StockDataRepository stockDataRepository;

    public StockDataService(StockDataRepository stockDataRepository) {
        this.stockDataRepository = stockDataRepository;
    }

    // Get all stock data
    public List<StockData> getAllStockData() {
        return stockDataRepository.findAll();
    }

    // Get stock data by ID
    public Optional<StockData> getStockDataById(Long id) {
        return stockDataRepository.findById(id);
    }

    // Save or update stock data
    public StockData saveOrUpdateStockData(StockData stockData) {
        return stockDataRepository.save(stockData);
    }

    // Delete stock data by ID
    public void deleteStockData(Long id) {
        stockDataRepository.deleteById(id);
    }
}