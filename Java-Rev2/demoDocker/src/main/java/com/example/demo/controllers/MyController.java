package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@RequestMapping("/")
	public String m1()
	{
		return "Working";
	}
}
