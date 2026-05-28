package com.example.rewardsapp.repository;

import com.example.rewardsapp.model.Transaction;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class TransactionRepository {
    public List<Transaction> getTransactions(){
        return List.of(
                new Transaction("Sharad",111, LocalDate.of(2026,05,25)),
                new Transaction("Adhish",46,LocalDate.of(2025,03,23)),
                new Transaction("Jessica",340,LocalDate.of(2024,10,23))
        );
    }
}
