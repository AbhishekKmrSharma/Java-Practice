package com.app;

import java.util.ArrayList;
import java.util.List;

import com.app.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LaunchApp 
{
	public static void main(String[] args)
	{
		Employee emp1 =  new Employee(101, "Abhishek", "PTK1");
		Employee emp2 =  new Employee(102, "Sharma", "PTK2");
		Employee emp3 =  new Employee(103, "Kumar", "PTK3");
		Employee emp4=  new Employee(104,"Kunal", "Pune");
		Employee emp5 =  new Employee(105, "Praneet", "AP");
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		
		ObjectMapper om = new ObjectMapper();
		
		String output = "";
		
		
		try 
		{
			//output = om.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
			output = om.writeValueAsString(emp);
		} 
		catch (JsonProcessingException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println(output);
	}
}
