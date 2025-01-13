package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.service.IService;
import com.app.views.EmployeeRecordsView;

import java.util.List;

@SpringBootApplication
public class TeluskoDay27Application {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(TeluskoDay27Application.class, args);
		IService is = ctx.getBean(IService.class);
		
		List<EmployeeRecordsView> ls = is.fetchDetailsBySalary(20000);
		
		for(EmployeeRecordsView ls1:ls)
		{
			System.out.println(ls1.getName()+" : "+ls1.getSalary());
		}
		
	}

}
