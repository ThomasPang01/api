package com.example.api.repository;

import com.example.api.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByCustomerId(String customerId);
    List<Transaction> findByAccountNumber(String accountNumber);
    List<Transaction> findByDescriptionContaining(String description);
}