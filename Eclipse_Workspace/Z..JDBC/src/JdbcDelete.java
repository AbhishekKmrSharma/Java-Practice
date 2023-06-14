import java.sql.*;
public class JdbcDelete 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","abhi@123");
		
		String str="delete from t1 where id=103";
		PreparedStatement ps=cn.prepareStatement(str);
		
		ps.executeUpdate();
		System.out.println("Deleted");
		
		
		
	}
}
