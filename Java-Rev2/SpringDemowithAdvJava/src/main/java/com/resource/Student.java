package com.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("std")
@Lazy
public class Student
{
	@Value("101")
	private int age;
	
	@Value("Abhishek")
	private String name;

	@Autowired
	private Address add;

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", add=" + add + "]";
	}
	
	
}
