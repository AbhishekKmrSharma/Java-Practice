package com.resource;

public class Student
{
	private int rollno;
	private String name;
	private Address add;
	
	public Student()
	{
		
	}
	
	public Student(int rollno, String name, Address add)
	{
		this.name = name;
		this.rollno = rollno;
		this.add = add;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", add=" + add + "]";
	}
}
