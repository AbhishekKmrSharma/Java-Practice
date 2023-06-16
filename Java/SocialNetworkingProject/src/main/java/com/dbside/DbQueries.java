package com.dbside;


import java.sql.*;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;


public class DbQueries
{
	public static ResultSet loginCheck(String email, String password)
	{
		ResultSet rs = null;
		try
		{
			Connection cn = DbConnection.getConnection();
			PreparedStatement ps = cn.prepareStatement("select * from register where email=? and password =?");
			ps.setString(1, email);
			ps.setString(2, password);
			System.out.println(ps+""+rs);
			rs = ps.executeQuery();
			System.out.println(rs);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return rs;
	}
	
	public static boolean checkUserExist(String email)
	{
		boolean status = false;
		try
		{
			Connection cn = DbConnection.getConnection();
			PreparedStatement ps = cn.prepareStatement("select * from resgister where email=?");
			ps.setString(1, email);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				status = true;
			}
			else
			{
				status = false;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
	}
	
	public static void register(String name,String email,String pass,String gender,String city)
	{
		try
		{
			Connection cn = DbConnection.getConnection();
			PreparedStatement ps = cn.prepareStatement("insert into register values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, pass);
			ps.setString(4, gender);
			ps.setString(5, city);
			ps.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	public static boolean editProfile(String name,String email, String gender, String city)
	{
		boolean status = false;
		try
		{
			Connection cn = DbConnection.getConnection();
			PreparedStatement ps = cn.prepareStatement("update register set name=?, gender=?, city=? where email=?");
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, city);
			ps.setString(4, email);
			int result = ps.executeUpdate();
			
			if(result>0)
			{
				status = true;
			}
			else
			{
				status = false;
			}		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}	
}
