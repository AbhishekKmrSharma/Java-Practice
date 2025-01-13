package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcConcept 
{
	private static final String url = "jdbc:mysql://localhost:3306/db2024";
	private static final String uName = "root";
	private static final String pWord = "abhi@123";
	
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection(url, uName, pWord);
		
		String name = "select name from t1";
		
		
		
		PreparedStatement ps = cn.prepareStatement(name);
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1));
		}
		cn.close();
	}
}
