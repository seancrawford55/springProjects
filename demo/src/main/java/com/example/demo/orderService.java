package com.example.demo;

import com.PaymentService;

public class orderService {

    private PaymentService paymentService;

    public void OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder() {
        paymentService.processPayment(10);
    }

}
