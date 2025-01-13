package com.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.dao.EmployeeDaoImpl;
import com.app.dao.IEmployee;
import com.app.models.Employee;

@SpringBootApplication
public class Basics6SbjdbcApplication 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(Basics6SbjdbcApplication.class, args);
		
		IEmployee i = ctx.getBean(EmployeeDaoImpl.class);
		
		List<Employee> list = i.getStudents();
		
		for(Employee e : list)
		{
			System.out.println(e);
		}
			
	}

}
