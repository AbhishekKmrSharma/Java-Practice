package com.day2;

public class Employee 
{
	int age;
	String name;
	int sal;
	Address add;
	
	
	Employee()
	{
		System.out.println("Default");
	}

	Employee(int a,String b,int c)
	{
		this.age=a;
		this.name=b;
		this.sal=c;
	}
	
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
		
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+sal);
		System.out.println(add);
		return "";
	}
	
}
