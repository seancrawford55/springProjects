package com.example.demo;

import com.PaymentService;

public class StripePayment implements PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe");
        System.out.println("Amount: " + amount);
    }

}
