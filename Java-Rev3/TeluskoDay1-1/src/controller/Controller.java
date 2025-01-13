package controller;

import service.Courses;
import service.Dsa;
import service.JavaC;

public class Controller 
{
	public static void main(String[] args) 
	{
		CoursePurchase cp = new CoursePurchase();
		
		cp.setCs(new JavaC());
		
		cp.buyCourse(3000);
		
	}
}
