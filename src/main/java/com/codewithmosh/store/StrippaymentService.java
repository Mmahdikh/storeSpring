package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component("STRIPE")
//@Primary
public class StrippaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enablead;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("apiUrl: " + apiUrl);
        System.out.println("enablead: " + enablead);
        System.out.println("timeout: " + timeout);
        System.out.println("supportedCurrencies: " + supportedCurrencies);
        System.out.println("Amount: " + amount);
    }
}
