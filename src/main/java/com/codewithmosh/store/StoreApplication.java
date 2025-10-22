package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
//        context.getBean(OrderService.class).placeOrder();

//         var resource = context.getBean(HeavyResource.class);

        var orderService = context.getBean(OrderService.class);
        var orderService2 = context.getBean(OrderService.class);

        orderService.placeOrder();



//        var order = new OrderService(new Paypal());
//        order.setPaymentService(new Paypal());
//        order.placeOrder();
    }


}
