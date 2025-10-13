package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${payment.service:paypal}")
    private String paymentService;

    @Bean
    public PaymentService stripe() {
        return new StrippaymentService();
    }
    @Bean
    public PaymentService paypal(){
        return new Paypal();
    }

    @Bean
    public OrderService order(){
        if (paymentService.equals("paypal")) {
            return new OrderService(paypal());
        }else
            return new OrderService(stripe());
    }
}
