package com.app.controllers;

import java.nio.file.Path;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.models.Employee;

@Controller
public class MyController1 
{
	@GetMapping("/getinfo")
	public void getInfo(Model model, String name1, @RequestParam("name2")String n2)
	{
		String resp = "Hello "+name1+" Good Evening "+n2;
		model.addAttribute("wish", resp);
		return;
	}
	
	@GetMapping("/getinfo1/{name1}/{name2}/{name3}")
	public String getInfo(Model model, @PathVariable("name1")String name1, @PathVariable("name2")String name2, @PathVariable("name3") String name3)
	{
		String response = "Hiiiii "+name1+" "+name2+" "+name3;
		model.addAttribute("resp", response);
		return "pathvdemo";
	}
	
	@PostMapping("/sendData")
	public String recieveData(Model model, @ModelAttribute Employee emp)
	{
		model.addAttribute("emp", emp);
		return "formResponse";
	}
	
}
