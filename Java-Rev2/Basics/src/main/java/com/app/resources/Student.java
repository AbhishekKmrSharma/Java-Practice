package com.app.resources;

public class Student 
{
	private String name;
	private int marks;
	private Address add;
	
	public Student()
	{
		System.out.println("Student Obj Created");
	}
	
	public Student(String name, int marks, Address add)
	{
		this.name = name;
		this.marks = marks;
		this.add =add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", add=" + add + "]";
	}
}
