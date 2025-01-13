package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class SimpleJdbc 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2024", "root", "abhi@123");
		PreparedStatement ps = con.prepareStatement("insert into data values(104,2,'singh')");
		int rs = ps.executeUpdate();
		
//		while(rs.next())
//		{
//			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
//		}
		ps.close();
		con.close();
	}
}
