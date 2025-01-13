package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.beans.Demo;

@SpringBootApplication
public class TeluskoDay21Application {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(TeluskoDay21Application.class, args);
		
		Demo d = ctx.getBean(Demo.class);
		d.init();
		ctx.close();
		//Demo d1 = ctx.getBean(Demo.class); //error container has been closed already
		
	}

}
