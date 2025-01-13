package com.app;

import java.io.File;

import com.app.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LaunchApplication 
{
	public static void main(String[] args) throws Exception
	{
		ObjectMapper om = new ObjectMapper();
		
		Employee emp = om.readValue(new File("json/sample.json"), Employee.class);
		
		System.out.println(emp);
	}
}
