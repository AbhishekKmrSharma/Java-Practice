package com.example.demo.resources;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Hp implements Laptop
{
	public void display()
	{
		System.out.println("I am HP");
	}
}
