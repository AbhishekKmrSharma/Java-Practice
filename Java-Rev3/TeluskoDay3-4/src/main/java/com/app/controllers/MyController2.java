package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController2
{
	@GetMapping(value={"first","ser"})
	public String getInfo(Model model)
	{
		System.out.println(model.getClass().getName());
		model.addAttribute("welcome","Welcome to the app through Second Controller");
		return "second";
	}
}
