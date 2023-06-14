import java.sql.*;
public class PreparedJdbc 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","abhi@123");
		PreparedStatement ps=cn.prepareStatement("insert into t1(id,name,sal) values(?,?,?)");
		
		ps.setInt(1,103);
		ps.setString(2,"Abhishek");
		ps.setInt(3,2000);
		
		ps.executeUpdate();
		System.out.println("Inserted");
		
		
	}
}
