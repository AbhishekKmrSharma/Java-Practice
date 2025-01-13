package com.example.demo.resources;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Dell")
public class Dell implements Laptop
{
	public void display()
	{
		System.out.println("I am Dell");
	}
}
