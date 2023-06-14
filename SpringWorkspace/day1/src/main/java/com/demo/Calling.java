package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calling 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("first.xml");
		
		CarTypes obj = (CarTypes) ctx.getBean("dra");
		
		System.out.println(obj);
	}
}
