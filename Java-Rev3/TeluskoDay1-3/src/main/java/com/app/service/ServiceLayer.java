package com.app.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.app.passwords.Password;

@Service
public class ServiceLayer 
{
	public ServiceLayer() 
	{
		System.out.println("ServiceLayer");
	}
	
	@Bean
	public void passwordObj()
	{
		Password pass = new Password();
	}
}
