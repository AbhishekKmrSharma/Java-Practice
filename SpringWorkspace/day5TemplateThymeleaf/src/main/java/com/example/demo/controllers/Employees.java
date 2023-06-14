package com.example.demo.controllers;

public class Employees 
{
	String name;
	int age;
	int salary;
	String dept;
	
	Employees(String name,int age,int salary,String dept)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.dept=dept;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employees [name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
}
