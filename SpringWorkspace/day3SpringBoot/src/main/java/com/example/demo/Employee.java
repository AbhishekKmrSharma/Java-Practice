package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	@Value("${user}")
	String name;
	@Value("25")
	int age;
	@Autowired
	Laptop laptop;
	
	Employee()
	{
		System.out.println("Obj created !!");
	}

	@Override
	public String toString() {
		System.out.println("Name : "+name);
		System.out.println("Age: "+age);
		laptop.company();
		return "";
	}
	
}
