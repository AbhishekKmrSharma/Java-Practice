package com.javabeansclasses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunnerClass 
{
	public static void main(String[] args)
	{
		ApplicationContext cnt = new ClassPathXmlApplicationContext("com/javabeansXml/NewFile.xml");
		
		Employee e = (Employee) cnt.getBean("emp");
		System.out.println(e);
	}
}
