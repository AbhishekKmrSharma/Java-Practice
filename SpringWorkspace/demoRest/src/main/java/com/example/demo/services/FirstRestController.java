package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController
{
	@Autowired
	Dao dao;
	@GetMapping("/getdata/{id}")
	Optional<Emp> hi(@PathVariable int id)
	{
		return dao.findById(id);
	}
	
	@PostMapping("/data")
	String insert(@RequestBody Emp e)
	{
		dao.save(e);
		return "Inserted";
	}
	
	@DeleteMapping("/del")
	String del(@RequestBody Emp e)
	{
		dao.deleteById(e.getId());
		return "Deleted";
	}
	
	@PutMapping("/putdata")
	String putData(@RequestBody Emp e)
	{
		if(dao.existsById(e.id))
		{
			dao.save(e);
			return "Updated";
		}
		else
		{
			return "Employee Doesnt Exist";
		}
	}
	
	@GetMapping("/search")
	List<Emp> search(@RequestParam String designation)
	{
		return dao.findByDesignation(designation);
		
	}
	
}
