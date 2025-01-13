package com.app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.app.model.*;

@SpringBootApplication(scanBasePackages = "com.app")
public class Zday3SpringBootApplication 
{

	public static void main(String[] args) 
	{
		ApplicationContext ctx = SpringApplication.run(Zday3SpringBootApplication.class, args);
		
		Employee emp1 = (Employee) ctx.getBean("emp");
		System.out.println(emp1);
	}

}
