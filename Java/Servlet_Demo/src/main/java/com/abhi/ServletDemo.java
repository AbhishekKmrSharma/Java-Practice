package com.abhi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		String s = request.getParameter("s1");
		
		PrintWriter out = response.getWriter();	
		
		int c = 0;
		
		if(s.equals("Addition"))
		{
			c = a + b;
		}
		else if(s.equals("Subtraction"))
		{
		   c = a - b;
		}
		else
		{
			c = a*b;
		}
		
		out.println(c);
	}
}
