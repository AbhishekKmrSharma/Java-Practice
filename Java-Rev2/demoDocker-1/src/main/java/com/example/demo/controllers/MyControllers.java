package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daos.Dao;
import com.example.demo.entities.Student;

@RestController
public class MyControllers 
{
	@Autowired
	Dao dao;
	
	@RequestMapping("/")
	public List<Student> m1()
	{
		 return dao.findAll();
	}
}
