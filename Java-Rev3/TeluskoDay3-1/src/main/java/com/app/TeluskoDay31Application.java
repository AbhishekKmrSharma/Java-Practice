package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.app.views.*;

import com.app.service.IService;

@SpringBootApplication
public class TeluskoDay31Application {

	public static void main(String[] args) 
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(TeluskoDay31Application.class, args);
		
		IService i = ctx.getBean(IService.class);
		
		i.fetchDetailsBySalaryLessThan(10001, ResultView1.class).forEach(v->System.out.println(v.getName()+" "+v.getSalary()));
	}

}
