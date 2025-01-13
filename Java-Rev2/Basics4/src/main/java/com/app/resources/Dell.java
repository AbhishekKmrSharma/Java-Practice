package com.app.resources;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.app.service.Laptop;

@Component("dell")
@Primary
public class Dell implements Laptop
{

	@Override
	public void display() 
	{
		System.out.println("I am Dell");
	}
	
}
