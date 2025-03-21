package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/hello")  // Use lowercase for best practice
    public String sayHello() {
        return "Welcome";
    }
}

