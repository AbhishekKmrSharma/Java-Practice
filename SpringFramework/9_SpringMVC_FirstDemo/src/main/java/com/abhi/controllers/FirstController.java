package com.abhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController 
{
	@RequestMapping("/one")
	public ModelAndView first(Loginn l)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", l.user);
		mv.addObject("pass",l.pass);
		System.out.println(mv.toString());
		mv.setViewName("first");
		return mv;
	}
}
