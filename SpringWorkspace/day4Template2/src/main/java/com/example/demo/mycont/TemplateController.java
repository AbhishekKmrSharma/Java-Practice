package com.example.demo.mycont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController 
{
	@RequestMapping("/check")
	String check()
	{
		return "check";
	}
	
	@RequestMapping("/check1")
	String check1()
	{
		return "check1";
	}
}
