package com.abhishek.callingclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abhishek.Student;

public class StudentCalling 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/abhishek/configFileXml/app.xml");
		
		Student std = (Student) ctx.getBean("stdId");
		
		System.out.println(std);

	}
}
