package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeController 
{
	@Autowired
	Dao dao;
	
	@RequestMapping("/")
	String home()
	{
		return "demo.jsp";
	}
	
	@RequestMapping("/enter") 
	String enter(Emp e)
	{
		if(!dao.existsById(e.getId()))
		{
		 dao.save(e);
		}
	return "demo.jsp";
	}
	
	@RequestMapping("/update")
	@ResponseBody
	String update(Emp e)
	{
		if(dao.existsById(e.getId()))
		{
			dao.save(e);
			return "demo.jsp";
		}
		else
		{
			return "Employee doesnt exist"; 
		}
		
	}
	
	@RequestMapping("/search")
	@ResponseBody
	String search(int id)
	{
		if(dao.existsById(id))
		{
		return dao.findById(id).toString();
		}
		else
		{
			return "Employee Not Found";
		}
	}
	
	@RequestMapping("/del")
	@ResponseBody
	String del(int id,Emp e)
	{
		if(dao.existsById(e.getId()))
		{
		dao.deleteById(id);
		return "Deleted";
		}
		else
		{
			return "Empolyee With Provided Id Doesnt Exist";
		}
	}
	
	@RequestMapping("/desg")
	@ResponseBody
	List<Emp> serachDesg(String desig)
	{
		return dao.findByDesig(desig);
	}
	

	@RequestMapping(path="/salary", produces=("application/xml"))
	@ResponseBody
	List<Emp> serachDesg(int salary)
	{
		System.out.println(dao.findBySorted(salary));
		return dao.findBySalaryGreaterThan(salary);
	}
}
