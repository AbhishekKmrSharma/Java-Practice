package com.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.beans.Student;
import com.serviceLayer.ServiceInt;

public class App 
{
	public static void main(String[] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/xmlConfig/daoConfigFile.xml");
		
		Student std = (Student) ctx.getBean("studentBean");
		ServiceInt si = (ServiceInt) ctx.getBean("dao");
		
		boolean result = si.serviceLayer(std);
		if(result)
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
