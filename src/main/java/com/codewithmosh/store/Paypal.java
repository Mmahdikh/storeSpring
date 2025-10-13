package com.codewithmosh.store;

import org.springframework.stereotype.Component;

//@Component("paypal")
public class Paypal implements PaymentService {

    public void processPayment(double amount) {
        System.out.println("Paypal");
        System.out.println("Amount: " + amount);
    }

}
