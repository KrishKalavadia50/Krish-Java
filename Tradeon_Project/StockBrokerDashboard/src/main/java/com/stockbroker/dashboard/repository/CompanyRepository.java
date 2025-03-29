package com.stockbroker.dashboard.repository;

import com.stockbroker.dashboard.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    boolean existsByEmail(String email);

    Company findByEmail(String email);
}
