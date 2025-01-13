package com.app.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Hp")
public class Hp implements Laptop
{

	@Override
	public void company()
	{
		System.out.println("Having HP Laptop");
	}
	
}
