package com.app.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;

@RestController
public class RestController2WithStudent 
{
	@GetMapping("get")
	public ResponseEntity<Student> getInfo()
	{
		Student std = new Student(1,"Abhishek","PTK");
		return new ResponseEntity<Student>(std,HttpStatus.FOUND);
	}
	
	@PostMapping("post")
	public String storeData(@RequestBody Student std)
	{
		System.out.println(std);
		return "Stored in DB";
	}
}
