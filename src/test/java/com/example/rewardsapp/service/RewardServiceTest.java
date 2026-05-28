package com.example.rewardsapp.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardServiceTest {
    RewardService service = new RewardService();

    @Test
    void testCalculatePoints() {
        int points = serviceTestHelper(120);
        assertEquals(90, points);
    }

   @Test
   void testBelow50() {
       int points = serviceTestHelper(40);
       assertEquals(0, points);
   }

   private  int serviceTestHelper(double amount){

       int points = 0;

       if (amount > 100) {
           points += (amount - 100) * 2;
           amount = 100;
       }
       if (amount > 50) {
           points += (amount - 50);
       }
       return points;
   }

}

