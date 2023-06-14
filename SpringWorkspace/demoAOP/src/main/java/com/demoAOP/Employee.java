package com.demoAOP;

import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	public void insert()
	{
		System.out.println("Inserted value");
	}
	
	void deleted()
	{
		System.out.println("Deleted");
	}
	
}
