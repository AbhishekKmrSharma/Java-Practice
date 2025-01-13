package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.model.Employee;
import com.app.service.IService;

@Controller
public class MyController1 
{
	@Autowired
	private IService is;
	
	
	@PostMapping("/insert")
	public String insertEmp(Employee emp, Model model)
	{
		model.addAttribute("resp", "Inserted");
		is.insert(emp);
		//return "redirect:/"; To redirect from controller
		return "response";
	}
	
	@PostMapping("/delete")
	public String delete(Model model, int id)
	{
		model.addAttribute("resp", "Deleted with ID : "+id);
		is.deleteEmp(id);
		return "response";
	}
}
