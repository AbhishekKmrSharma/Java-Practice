package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("mycontroller1")
public class MyController1 
{
	@GetMapping("/first")
	public ModelAndView greetings()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("welcome", "Good Evening, Welcome to the App from Controller 1 !!");
		mv.setViewName("first");
		return mv;
	}
	
	@GetMapping("/third")
	public void getInfo()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("welcome", "Good Evening, Welcome to the App from Controller 1 !!");
		//return;
	}
}
