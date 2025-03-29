package com.Tradeonai.service;

import com.Tradeonai.model.Stock;
import com.Tradeonai.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.*;
import java.util.logging.Logger;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    private static final Logger LOGGER = Logger.getLogger(StockService.class.getName());
    private final String API_KEY = "ZH2UJ4OE5P6STELY";
    private final String API_URL = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol={symbol}&apikey=" + API_KEY;

    public Stock fetchStockData(String symbol, String name) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, Object> response;
        try {
            response = restTemplate.getForObject(API_URL, Map.class, symbol);
        } catch (Exception e) {
            LOGGER.severe("Failed to fetch stock data for: " + symbol + " - " + e.getMessage());
            return null;
        }

        if (response == null || !response.containsKey("Global Quote")) {
            LOGGER.warning("Invalid response for: " + symbol);
            return null;
        }

        Map<String, Object> stockData = (Map<String, Object>) response.get("Global Quote");
        Double price = parseDouble(stockData.get("05. price"));
        Double change = parseDouble(stockData.get("09. change"));
        Double percentChange = parseDouble(stockData.get("10. change percent"));
        String trend = (change >= 0) ? "UP" : "DOWN";

        Stock stock = new Stock(symbol, name, price, change, percentChange, trend, LocalDateTime.now());
        return stockRepository.save(stock);
    }

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public List<Stock> fetchMultipleStocks(List<String> symbols) {
        List<Stock> stockList = new ArrayList<>();
        for (String symbol : symbols) {
            try {
                Stock stock = fetchStockData(symbol, symbol.toUpperCase());
                if (stock != null) {
                    stockList.add(stock);
                }
            } catch (Exception e) {
                LOGGER.warning("Error fetching stock for " + symbol + ": " + e.getMessage());
            }
        }
        return stockList;
    }

    private Double parseDouble(Object value) {
        try {
            if (value instanceof String) {
                return Double.valueOf(((String) value).replace("%", ""));
            }
            return (Double) value;
        } catch (Exception e) {
            return 0.0;
        }
    }
}
