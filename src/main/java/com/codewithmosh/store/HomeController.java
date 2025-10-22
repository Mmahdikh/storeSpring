package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/ ")
    public String index() {
        System.out.println("app name: "+appName);
        return "mmtest.html";
    }
    @RequestMapping("/mmtest/")
    public String mmtest() {
        System.out.println("mmtest");
        return "mmtest.html";
    }
}
