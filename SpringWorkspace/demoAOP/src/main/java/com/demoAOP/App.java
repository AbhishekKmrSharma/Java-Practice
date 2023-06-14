package com.demoAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Employee e1=ac.getBean(Employee.class);
		e1.insert();
	}
}
