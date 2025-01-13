package com.app.models;


public class Employee 
{
	private int id;
	private String email;
	private double salary;
	private char eligible;
	
	public Employee() 
	{
		super();
	}

	public Employee(int id, String email, double salary, char eligible) {
		super();
		this.id = id;
		this.email = email;
		this.salary = salary;
		this.eligible = eligible;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public char getEligible() {
		return eligible;
	}

	public void setEligible(char eligible) {
		this.eligible = eligible;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", email=" + email + ", salary=" + salary + ", eligible=" + eligible + "]";
	}
}
