package com.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.app.service.Laptop;

@Component("emp")
public class Employee 
{
	@Value("${eId}")
	private int eId;
	@Value("${user}")
	private String name;
	
	@Qualifier("Hp")
	@Autowired
	Laptop laptop;
	
	@Override
	public String toString() {
		System.out.println("Name :"+name);
		System.out.println("EID :"+eId);
		laptop.company();
		return "";
	}
}
