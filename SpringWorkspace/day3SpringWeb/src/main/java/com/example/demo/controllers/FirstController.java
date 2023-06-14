package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController 
{
	@RequestMapping("/first")
	public String firstWeb()
	{
		return "first.html";
	}
	@RequestMapping("/second")
	String secondWeb()
	{
		return "second.html";
	}
	@RequestMapping("/body")
	@ResponseBody
	String defaultWeb()
	{
		return "<h3>Response Body</h3>";
	}
}

