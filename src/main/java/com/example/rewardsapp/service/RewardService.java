package com.example.rewardsapp.service;

import com.example.rewardsapp.model.Transaction;
import com.example.rewardsapp.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RewardService {
    @Autowired
    private TransactionRepository transactionRepository;

    public Map<String , Map<String,Integer>> calculateRewards(){
        List <Transaction> transactions = transactionRepository.getTransactions();

        if(transactions == null || transactions.isEmpty()){
            throw new RuntimeException("No transaction found");
        }

        Map<String, Map<String,Integer>> result = new HashMap<>();

        for(Transaction t:transactions){
            String customer = t.getCustomrId();
            String month = t.getDate().getMonth().toString();

            int points = calculatedPoints(t.getAmount());

            result.putIfAbsent(customer,new HashMap<>());
            Map<String,Integer> data = result.get(customer);

            data.put(month,data.getOrDefault(month , 0) + points);
            data.put("TOTAL" , data.getOrDefault("TOTAL",0)+points);
        }
        return result;
    }

    private int calculatedPoints (double amount){
        int points = 0;
        if(amount > 100){
            points += (amount - 100) * 2;
            amount = 100;
        }

        if(amount > 50 ){
            points += (amount - 50);
        }

        return points;
    }
}
