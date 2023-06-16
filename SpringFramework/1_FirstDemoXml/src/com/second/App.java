package com.second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext app = new ClassPathXmlApplicationContext("com/xmlFirst/second.xml");
		
		Employee e =(Employee) app.getBean("emp");
		
		System.out.println(e);
	}
}
