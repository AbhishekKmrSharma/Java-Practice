package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dell implements Laptop
{
	public void company()
	{
		System.out.println("Having Dell Laptop");
	}
}
