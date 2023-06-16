package com.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App
{
	public static void main(String[] args) 
	{
		//try
		//{
			ApplicationContext ctx = new ClassPathXmlApplicationContext("com/xmlBeans/configFile.xml");
			
			JdbcTemplate templ = (JdbcTemplate) ctx.getBean("jdbc");
			StudentLoginData st = (StudentLoginData) ctx.getBean("login1");
			
			String query = "insert into register values('"+st.getName()+"', '"+st.getEmail()+"','"+st.getPassword()+"','"+st.getGender()+"','"+st.getAge()+"')";
			System.out.println(query);
			templ.update(query);
			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		
	}
}
