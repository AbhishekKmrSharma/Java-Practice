package com.demoAdvJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee 
{
	@Value("Abhishek")
	String name;
	@Value("25")
	int age;
	@Autowired
	Address add;
	
	Employee()
	{
		System.out.println("Obj created");
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", add=" + add + "]";
	}

	
	
	
}
