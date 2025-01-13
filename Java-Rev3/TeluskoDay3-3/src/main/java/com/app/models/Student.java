package com.app.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student 
{
	@Id
	private int id;
	private String name;
	private long marks;
	private String city;
	
	public Student()
	{
		super();
	}

	public Student(int id, String name, long marks, String city) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMarks() {
		return marks;
	}

	public void setMarks(long marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", city=" + city + "]";
	}
	
	
	
	
}
