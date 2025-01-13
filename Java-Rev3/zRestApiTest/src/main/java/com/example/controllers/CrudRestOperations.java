package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.Dao;
import com.example.repository.Student;

@RestController
public class CrudRestOperations 
{
	@Autowired
	Dao dao;
	
	@PostMapping("/insertData")
	public String insertData(@RequestBody Student std)
	{
		dao.save(std);
		return "Inserted";
	}
	
	@GetMapping("/search")
	public Optional<Student> search(@RequestParam int id)
	{
		return dao.findById(id);
	}
	
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam int id)
	{
		dao.deleteById(id);
		return "Deleted";
	}
}
