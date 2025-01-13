package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.dao.IEmployeeDao;

@SpringBootApplication
public class Basics7SbDataJdbcApplication {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(Basics7SbDataJdbcApplication.class, args);
		
		IEmployeeDao i = ctx.getBean(IEmployeeDao.class);
		
		int result = i.insert();
		
		if(result > 0)
			System.out.println("Success");
		else
			System.out.println("Failed");
	}

}
