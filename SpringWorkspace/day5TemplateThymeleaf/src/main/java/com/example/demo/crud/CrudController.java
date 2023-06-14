package com.example.demo.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CrudController 
{
	List<Employes> e=new ArrayList<>();
	
	@RequestMapping("empdata")
	String empData()
	{
		return "tableCrud";
	}
	
	@RequestMapping("/data")
	@ResponseBody
	String crud(String name,int age,String desig,int sal,Model m)
	{
		e.add(new Employes(name,age,desig,sal));
		return "ADDED";
	}
	
	@RequestMapping("display")
	String display(Model m)
	{
		m.addAttribute("emp",e);
		return "table";
	}
}
