package com.social;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dbside.DbQueries;

public class EditMyProfile extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name1");
		String email = request.getParameter("email1");
		String gender = request.getParameter("gender1");
		String city = request.getParameter("city1");
		
		boolean status = DbQueries.editProfile(name, email, gender, city);
		
		if(status)
		{
			HttpSession session = request.getSession();
			session.setAttribute("session_name", name);
			session.setAttribute("session_gender", gender);
			session.setAttribute("session_city", city);
			
			response.sendRedirect("editProfile.jsp");
		}
		else
		{
			response.sendRedirect("error.jsp");
		}
	}
}
