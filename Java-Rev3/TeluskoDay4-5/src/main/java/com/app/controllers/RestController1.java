package com.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class RestController1 
{
	@GetMapping("/test1")
	public String test1()
	{
		return "Working Test 1 without ResponseEntity";
	}
	
	@GetMapping("test2")
	public ResponseEntity<String> test2()
	{
		return new ResponseEntity<String>("Working Test2 with Response Entity", HttpStatus.CREATED);
	}
}
