package com.app.resources;

public class Student 
{
	private int age;
	private String name;
	private char gender;
	private Address add;
	
	public Student()
	{
		System.out.println("Std obj created");
	}
	
	public Student(int age, String name, char gender, Address add)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.add = add;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", gender=" + gender + ", add=" + add + "]";
	}
	
	
}
