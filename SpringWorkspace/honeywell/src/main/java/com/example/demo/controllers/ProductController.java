package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
	@Autowired
	Dao dao;
	
	@GetMapping("/")
	String home()
	{
		return "productmanagement.jsp";
	}
	
	@PostMapping("/enter") 
	String enter(Product p)
	{
		if(!dao.existsById(p.getPid()))
		{
		 dao.save(p);
		}
	return "productmanagement.jsp";
	}
	
	@PutMapping("/disp")
	@ResponseBody
	public List<Product> displayAll()
	{
		return dao.findAll();
	}
}
