package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.configFiles.MyConfigFile;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfigFile.class);
		
		Object obj = ctx.getBean("std");
		System.out.println(obj);
	}
}
