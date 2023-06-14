package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Day3SpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ct=SpringApplication.run(Day3SpringBootApplication.class, args);
		
		Object obj = ct.getBean(Employee.class);
		
		System.out.println(obj);
	}

}
