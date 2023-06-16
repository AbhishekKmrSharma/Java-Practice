package com.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CallingFirstDemo
{
	public static void main(String[] args) 
	{
		ApplicationContext app = new ClassPathXmlApplicationContext("com/xmlFirst/app1.xml");
		
		FirstDemo obj = (FirstDemo) app.getBean("first");
		
		System.out.println(obj);
	}
}
