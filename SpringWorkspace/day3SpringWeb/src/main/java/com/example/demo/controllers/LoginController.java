package com.example.demo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController 
{
	String temp ="";
	
	@RequestMapping("/login")
	String login()
	{
		return "login.html";
	}
	
	@RequestMapping("/verify")
	String verify(String user,String pwd,HttpServletRequest req,HttpSession s)
	{
		System.out.println(pwd);
		System.out.println("Temp = "+temp);
		
		if(pwd.equals(temp))
		{
			return "login.jsp";
		}
		else
		{
			return "invalid.jsp";
		}
	}
	
	@RequestMapping("/register")
	String register(Employee e)
	{
		return "register.html";
	}
	
	@RequestMapping("/reg")
	String reg(HttpServletRequest req, HttpServletResponse resp)
	{
		HttpSession session = req.getSession();
		
		String name = req.getParameter("name");
		String pass = req.getParameter("pwd");
		
		session.setAttribute("password", pass);
		session.setAttribute("session_name", name);
		
		temp = (String) session.getAttribute("password");
		return "reg.jsp";
	}
}
