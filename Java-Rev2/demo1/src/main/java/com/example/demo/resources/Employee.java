package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	@Value("${age}")
	private int age;
	@Value("${name}")
	private String name;
	@Autowired
	@Qualifier("Dell")
	Laptop laptop;
	
	public void show()
	{
		System.out.println(name+" "+age);
		laptop.display();
	}
	
}
