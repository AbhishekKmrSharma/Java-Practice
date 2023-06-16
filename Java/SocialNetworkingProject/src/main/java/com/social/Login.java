package com.social;


import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbside.DbQueries;

public class Login extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email = request.getParameter("email1");
		String pass = request.getParameter("pass1");
		
		ResultSet rs = DbQueries.loginCheck(email,pass);
		
		try 
		{
			if(rs.next()) 
			{
				HttpSession session = request.getSession();
				
				session.setAttribute("session_name", rs.getString("name"));
				session.setAttribute("session_email", email);
				session.setAttribute("session_gender", rs.getString("gender"));
				session.setAttribute("session_city", rs.getString("city"));
				
				response.sendRedirect("home.jsp");
			}
			else
			{
				response.sendRedirect("index.jsp");
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
