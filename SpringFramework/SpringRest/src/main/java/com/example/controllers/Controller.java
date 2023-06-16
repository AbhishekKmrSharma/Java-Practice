package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
	@GetMapping("/m")
	public String m1()
	{
		return "Hello m1";
	}
	
	@PostMapping("/m")
	public String m2()
	{
		return "Hello m1"+"POST";
	}
}
