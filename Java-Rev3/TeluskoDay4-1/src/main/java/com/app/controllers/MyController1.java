package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.model.Course;
import com.app.service.IService;

@Controller
public class MyController1 
{
	@Autowired
	private IService is;
	
	@GetMapping("/response")
	public void getresponse(Model model)
	{
		Course course = is.getCourses();
		model.addAttribute("course", course);
		return;
	}
}
