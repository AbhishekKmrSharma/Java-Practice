package com.example.demo.mycontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegisterController 
{
	@RequestMapping("/register2")
	String rgstr()
	{
		return "register2.html";
	}
	
	@RequestMapping("/registered")
	ModelAndView register(Employee e)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("user", e.user);
		mv.addObject("dept",e.dept);
		mv.addObject("sal",e.sal);
		mv.addObject("age",e.age);
		mv.setViewName("registered.jsp");
		System.out.println(e.getUser());
		return mv;
	}
}
