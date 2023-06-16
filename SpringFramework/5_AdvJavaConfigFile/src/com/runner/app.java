package com.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.componentclasses.Employee;
import com.configfile.ConfigFile;

public class app 
{
	public static void main(String[] args)
	{
	  ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigFile.class);
	
	  Employee e = (Employee) ctx.getBean("emp");
	  System.out.println(e);
	}
	
}
