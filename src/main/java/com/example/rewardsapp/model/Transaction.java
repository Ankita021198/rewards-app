package com.example.rewardsapp.model;

import java.time.LocalDate;

public class Transaction {
    private  String customrId;
    private double amount;
    private LocalDate date ;

    public Transaction(String customrId, double amount, LocalDate date) {
        this.customrId = customrId;
        this.amount = amount;
        this.date = date;
    }

    public String getCustomrId() {
        return customrId;
    }

    public void setCustomrId(String customrId) {
        this.customrId = customrId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
