package com.social;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbside.DbQueries;

public class Register extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("name1");
		String email = request.getParameter("email1");
		String pass = request.getParameter("pass1");
		String gender = request.getParameter("gender1");
		String city = request.getParameter("city1");
		
		boolean status = DbQueries.checkUserExist(email);
		
		if(status)
		{
			response.sendRedirect("index.jsp");
		}
		else
		{
			DbQueries.register(name, email, pass, gender, city);
			HttpSession session = request.getSession();
			
			session.setAttribute("session_name", name);
			session.setAttribute("session_email", email);
			session.setAttribute("session_pass", pass);
			session.setAttribute("session_gender", gender);
			session.setAttribute("session_city", city);
			
			response.sendRedirect("home.jsp");
		}
	}
}
