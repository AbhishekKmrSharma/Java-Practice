package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalculatorController 
{
	@RequestMapping("/calc")
	String calc(int p1,int p2,Model m,HttpServletRequest request)
	{
		String s=request.getParameter("check");
		
		if(s.equals("ADDITION"))
		{
		      
			System.out.println("Yo");
			m.addAttribute("a",(p1+p2));
			return "addition";
		 }
		else if(s.equals("SUBTRACTION"))
		{
			m.addAttribute("a",p1-p2);
			return "subtraction";
		}
		else if(s.equals("MULTIPLICATION"))
		{
			m.addAttribute("a",p1*p2);
			return "multiplication";
		}
		else
		{
			if(p2==0)
			{
				return "error";
			}
			else
			{
				m.addAttribute("a",p1/p2);
				return "divide";
			}
		}
	}
	@RequestMapping("/calculator")
	String calculator()
	{
		return "calculator";
	}	
}
