package com.app.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dell implements Laptop
{

	@Override
	public void company() 
	{
		System.out.println("Give Dell Laptop");
	}
	
}
