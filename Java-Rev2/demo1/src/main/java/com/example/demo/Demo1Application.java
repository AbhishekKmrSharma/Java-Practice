package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.resources.Employee;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(Demo1Application.class, args);
		
		Employee e = ctx.getBean(Employee.class);
		e.show();
	}

}
