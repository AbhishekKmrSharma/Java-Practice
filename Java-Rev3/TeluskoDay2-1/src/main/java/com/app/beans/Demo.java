package com.app.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Demo
{
	static 
	{
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Non Static");
	}
	
	public Demo()
	{
		System.out.println("Constructor");
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("Init Method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy Method");
	}
	
}
