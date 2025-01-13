package com.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller1 
{
	@GetMapping("/test1")
	@ResponseBody
	public String test1()
	{
		return "Working Test 1 without ResponseEntity";
	}
	
	@GetMapping("test2")
	@ResponseBody
	public ResponseEntity<String> test2()
	{
		return new ResponseEntity<String>("Working Test2 with Response Entity", HttpStatus.CREATED);
	}
}
