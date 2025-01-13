package controller;

import service.Courses;

public class CoursePurchase 
{
	private Courses cs;
	
	public void setCs(Courses cs) 
	{
		this.cs = cs;
	}
	
	public void buyCourse(int amount)
	{
		cs.getCourse(amount);
	}
}
