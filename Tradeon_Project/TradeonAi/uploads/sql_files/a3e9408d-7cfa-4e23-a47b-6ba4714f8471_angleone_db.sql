-- Create database if not exists
CREATE DATABASE IF NOT EXISTS angleone_db;
USE angleone_db;

-- Create stocks table
CREATE TABLE IF NOT EXISTS stocks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    symbol VARCHAR(10) NOT NULL,
    company_name VARCHAR(255) NOT NULL,
    current_price DECIMAL(10,2) NOT NULL,
    open_price DECIMAL(10,2) NOT NULL,
    close_price DECIMAL(10,2) NOT NULL,
    high_price DECIMAL(10,2) NOT NULL,
    low_price DECIMAL(10,2) NOT NULL,
    volume BIGINT NOT NULL,
    market_cap BIGINT NOT NULL
);

-- Insert sample data
INSERT INTO stocks (symbol, company_name, current_price, open_price, close_price, high_price, low_price, volume, market_cap) VALUES
('RELIANCE', 'Reliance Industries', 2400.50, 2385.75, 2395.30, 2428.40, 2360.80, 14560000, 1612000000000),
('TCS', 'Tata Consultancy Services', 3520.80, 3505.60, 3518.40, 3555.90, 3480.50, 8760000, 1304000000000),
('INFY', 'Infosys Limited', 1618.25, 1602.50, 1610.75, 1645.80, 1589.20, 9800000, 689000000000),
('HDFC', 'HDFC Bank', 1550.60, 1542.75, 1548.90, 1575.30, 1525.50, 11200000, 834000000000),
('ICICIBANK', 'ICICI Bank', 905.40, 895.20, 900.80, 918.90, 880.75, 13450000, 630000000000),
('SBIN', 'State Bank of India', 620.75, 615.30, 618.50, 635.80, 605.20, 17840000, 512000000000),
('HINDUNILVR', 'Hindustan Unilever', 2450.80, 2420.30, 2442.75, 2480.60, 2405.50, 8200000, 574000000000),
('KOTAKBANK', 'Kotak Mahindra Bank', 1895.20, 1870.60, 1885.90, 1925.30, 1850.40, 7100000, 495000000000),
('BAJFINANCE', 'Bajaj Finance', 7105.50, 7050.20, 7085.80, 7220.75, 6980.30, 5600000, 428000000000),
('ASIANPAINT', 'Asian Paints', 3120.40, 3095.50, 3110.90, 3180.60, 3055.40, 6400000, 422000000000);

-- Indexes for performance optimization
CREATE INDEX idx_symbol ON stocks(symbol);
CREATE INDEX idx_company_name ON stocks(company_name);
