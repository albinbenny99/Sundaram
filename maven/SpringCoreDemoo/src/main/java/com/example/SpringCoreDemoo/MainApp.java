package com.example.SpringCoreDemoo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.SpringCoreDemoo.config.AppConfig;
import com.example.SpringCoreDemoo.model.Employee;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee e = ctx.getBean(Employee.class);
        System.out.println(e);
    }
}
