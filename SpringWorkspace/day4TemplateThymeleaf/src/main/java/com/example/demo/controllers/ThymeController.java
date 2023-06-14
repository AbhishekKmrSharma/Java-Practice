package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController 
{
	@RequestMapping("/homee")
	String homee(Model m)
	{
		String name="Abhishek";
		m.addAttribute("user",name);
		return "thyme";
	}
}
