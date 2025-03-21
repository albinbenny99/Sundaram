package com.example.SpringCoreDemoo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private int id = 100;
    private String name = "Ann";

    @Autowired
    private Address adr;  // Spring will inject Address automatically

    public Employee(Address adr) {
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "Employee: " + name + " | Address: " + adr;
    }
}
