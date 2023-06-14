package com.example.demo.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticDynamicPagesSelectionAutomatic 
{
	@RequestMapping("/home")
	String home()
	{
		return "home";
	}
	
	@RequestMapping("/about")
	String about()
	{
		return "aboutus";
	}
}
