package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.service.IService;

@SpringBootApplication
public class TeluskoDay32Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(TeluskoDay32Application.class, args);
		
		IService i = ctx.getBean(IService.class);
		
		i.getEmpDetails().forEach(v->System.out.println(v));
		System.out.println("=============================================================");
		i.getBySalary(10000).forEach(v->System.out.println(v));
		System.out.println("=============================================================");
		i.getEmpSalaryBetween(0, 100000).forEach(v->System.out.println(v));
		System.out.println("=============================================================");
		i.updateSalary(213654, "Abhishek");
		System.out.println("=============================================================");
		int i1 = i.deleteEmpById(4);
		if(i1 != 0)
			System.out.println("Success");
		else
			System.out.println("Failed or ID not available");
	}

}
