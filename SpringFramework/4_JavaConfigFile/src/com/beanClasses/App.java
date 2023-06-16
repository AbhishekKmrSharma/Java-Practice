package com.beanClasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configFile.ConfigFile;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext ct = new AnnotationConfigApplicationContext(ConfigFile.class);
		
		Employee e = (Employee) ct.getBean("emp");
		System.out.println(e);
	}
}
