package com.example.demo.controllers;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeController 
{
	@RequestMapping("/homee")
	String homee(Model m,String user)
	{
//		String name="Abhishek";
		m.addAttribute("user",user);
		return "thyme";
	}
	
	@RequestMapping("/homee2")
	String homee2(String user,Model m)
	{
		m.addAttribute("user",user);
		return "thyme";
	}
	
	@RequestMapping("/")
	String home()
	{
		return "dynamicThyme";
	}
	
	@RequestMapping("/look")
	String look()
	{
		return "lookAndFeel";
	}
	
	@RequestMapping("/emp")
	String employees(Model m)
	{
		List<Employees> e=new ArrayList<>();
		e.add(new Employees("Abhi",23,25000,"Devops"));
		e.add(new Employees("Abhishek",24,30000,"Tester"));
		e.add(new Employees("AbhiKumar",25,38000,"Developer"));
		e.add(new Employees("AbhiSharma",26,55000,"Manager"));
		m.addAttribute("name",e);
		return "employees";
	}
}
