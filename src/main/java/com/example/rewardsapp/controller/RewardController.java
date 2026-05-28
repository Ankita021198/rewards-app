package com.example.rewardsapp.controller;

import com.example.rewardsapp.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class RewardController {

    @Autowired
    private RewardService service;

    @GetMapping("/rewards")
    public Map<String , Map<String,Integer>> getRewards(){
        return service.calculateRewards();
    }
}
