package com.app.resources;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.service.Laptop;

@Component("hp")
public class Hp implements Laptop
{
	@Override
	public void display() 
	{	
		System.out.println("I am Hp");
	}
}
