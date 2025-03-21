package com.example.SpringCoreDemoo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.SpringCoreDemoo.model.Address;
import com.example.SpringCoreDemoo.model.Employee;

@Configuration
public class AppConfig {
    @Bean
    public Address address() {
        return new Address("New York", "NY"); // Creating Address bean
    }

    @Bean
    public Employee employee() {
        return new Employee(address()); // Injecting Address into Employee
    }
}
