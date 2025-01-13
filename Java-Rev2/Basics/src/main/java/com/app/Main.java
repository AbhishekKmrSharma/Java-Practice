package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.resources.Student;

public class Main 
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile.xml");
		
		Student std = (Student) ctx.getBean("id");
		System.out.println(std);
	}
}
