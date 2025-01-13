package com.app.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("std1")
@Lazy
public class Student 
{
	@Value("Abhishek")
	private String name;
	@Value("29")
	private int age;
	@Autowired
	private Address add;
	
	public Student()
	{
		System.out.println("Student Obj created");
	}
	
	public Student(String name, int age, Address add) 
	{
		super();
		this.name = name;
		this.age = age;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", add=" + add + "]";
	}
}
