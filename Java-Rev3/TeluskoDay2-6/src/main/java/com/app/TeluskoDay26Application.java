package com.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.models.Vaccine;
import com.app.service.IService;
import com.app.service.IServiceImpl;

@SpringBootApplication
public class TeluskoDay26Application {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(TeluskoDay26Application.class, args);
		
		IService data = ctx.getBean(IServiceImpl.class);
		
		Iterable<Vaccine> vData = data.fetchDetails(false, "vCompany");
		
		for(Vaccine v:vData)
		{
			System.out.println(v);
		}
		
		Iterable<Vaccine> v = data.fetchDetailsByPagination(0, 5, true, "vCost");
		for(Vaccine v1:v)
		{
			System.out.println(v1);
		}
		
		
	}

}
