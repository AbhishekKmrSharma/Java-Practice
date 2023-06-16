package com.second;

public class Employee 
{
	private int age;
	private String name;
	private int salary;
	private Address add;
	
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Age: "+age+"\n"+"Name: "+name+"\n"+"Salary: "+salary+"\n"+add;
	}
	
	
	
}
