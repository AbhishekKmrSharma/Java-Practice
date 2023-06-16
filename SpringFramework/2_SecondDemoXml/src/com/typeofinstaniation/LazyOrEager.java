package com.typeofinstaniation;

public class LazyOrEager
{
	private String name;
	private int salary;
	
	public LazyOrEager() 
	{
		System.out.println("Contructor Called");
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
	
	public void diplay()
	{
		System.out.print("Name: "+name+"\n");
		System.out.print("Name: "+name);
	}
	
}
