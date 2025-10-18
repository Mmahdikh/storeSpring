package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {
    private PaymentService paymentService;

    public OrderService(@Qualifier("STRIPE") PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService created");
    }
 
    public void placeOrder() {
        paymentService.processPayment(10);

    }
//for optional things we put setter:
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

}
