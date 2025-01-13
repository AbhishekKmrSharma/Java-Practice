package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student1")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int rollno;
	public String name;
	public char gender;
	
	
	
	public Student()
	{
		super();
	}

	public Student(int rollNo, String name, char gender) 
	{
		super();
		this.rollno = rollNo;
		this.name = name;
		this.gender = gender;
	}
	
	public int getRollNo() {
		return rollno;
	}
	public void setRollNo(int rollNo) {
		this.rollno = rollNo;
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
	@Override
	public String toString() {
		return "Student [rollNo=" + rollno + ", name=" + name + ", gender=" + gender + "]";
	}
}
