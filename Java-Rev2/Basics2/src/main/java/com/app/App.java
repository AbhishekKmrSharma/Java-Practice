package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.configFiles.MyConfigFile;
import com.app.resources.Student;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfigFile.class);
		
		Student std = (Student) ctx.getBean("std1");
		System.out.println(std);
	}
}
