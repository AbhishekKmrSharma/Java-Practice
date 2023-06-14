package com.day2JavaConfigFile;

public class Employee 
{
	String name;
	int age;
	Address add;
	
	Employee()
	{
		System.out.println("Default Constructor");
	}
	
	Employee(String name, int age,Address add)
	{
		this.name=name;
		this.age=age;
		this.add=add;
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
		return "Employee [name=" + name + ", age=" + age+"----"+add;
	}

	
	
	
}
