package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.models.Employee;
import com.app.models.EmployeeRepo;

@SpringBootApplication
public class TeluskoDay24Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(TeluskoDay24Application.class, args);
		
		EmployeeRepo data = ctx.getBean(EmployeeRepo.class);
		
		Employee e = new Employee(1, "Sunil", 10000);
		
		data.save(e);
		
	}

}
