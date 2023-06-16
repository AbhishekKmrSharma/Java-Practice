package com.componentclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee 
{
	@Value("Abhishek Kumar Sharma")
	private String name;
	@Value("27")
	private int age;
	@Autowired
	Address address;
	
	@Override
	public String toString() {
		return "Name: "+name+"\n"+"Age: "+age+"\n"+address;
	}
	
	
	
}
