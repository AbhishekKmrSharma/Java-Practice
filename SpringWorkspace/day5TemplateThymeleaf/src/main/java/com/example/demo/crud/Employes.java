package com.example.demo.crud;

public class Employes 
{
	String name;
	int age;
	String desig;
	int salary;
	
	
	
	public Employes(String name, int age, String desig, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.desig = desig;
		this.salary = salary;
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
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employes [name=" + name + ", age=" + age + ", desig=" + desig + ", salary=" + salary + "]";
	}
}
