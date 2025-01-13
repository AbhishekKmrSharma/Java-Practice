package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.service.IService;

@Controller
public class MyController1 
{
	@Autowired
	private IService is;
	
	@GetMapping("/wish")
	public void wish(Model model)
	{
		String wish = is.wish();
		model.addAttribute("wish", wish);
		System.out.println(wish);
	}
}
