package com.stockbroker.dashboard.repository;

import com.stockbroker.dashboard.model.StockData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDataRepository extends JpaRepository<StockData, Long> {
    // Custom query methods can be added here if needed
}
