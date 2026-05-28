package com.example.rewardsapp.repository;

import com.example.rewardsapp.model.Transaction;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class TransactionRepository {
    public List<Transaction> getTransactions(){
        return List.of(
        new Transaction("Amit", 120, LocalDate.of(2024, 1, 10)),
        new Transaction("Amit", 75, LocalDate.of(2024, 2, 15)),

        new Transaction("Priya", 200, LocalDate.of(2024, 3, 5)),
        new Transaction("Priya", 65, LocalDate.of(2024, 1, 25)),

        new Transaction("Rahul", 90, LocalDate.of(2024, 2, 10)),
        new Transaction("Rahul", 130, LocalDate.of(2024, 3, 20)),

        new Transaction("Neha", 40, LocalDate.of(2024, 1, 5)),
        new Transaction("Neha", 110, LocalDate.of(2024, 2, 18))
);
    }
}
