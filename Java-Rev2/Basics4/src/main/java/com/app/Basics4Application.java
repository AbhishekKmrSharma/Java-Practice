package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.app.resources.Employee;

@SpringBootApplication
public class Basics4Application 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = SpringApplication.run(Basics4Application.class, args);
		
		Employee emp = ctx.getBean(Employee.class);
		System.out.println(emp);
	}
}
