package com.dbside;

import java.sql.*;
import java.sql.DriverManager;

public class DbConnection
{
	static Connection cn;
	public static Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/socialnetwork","root","abhi@123");
		return cn;
	}
}
