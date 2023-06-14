package com.demo.revision;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Calling2 
{
	public static void main(String[] args) 
	{
		BeanFactory bc=new ClassPathXmlApplicationContext("revision.xml");
		
		RBI r= (RBI) bc.getBean("axis");
		
		System.out.println(r);
	}
}
