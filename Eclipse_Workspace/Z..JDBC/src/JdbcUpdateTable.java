import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class JdbcUpdateTable 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","abhi@123");
		String str="update t1 set name='Ramu' where id=103";
		PreparedStatement st=cn.prepareStatement(str);
		
		
		st.executeUpdate();
		System.out.println("Updated");
		st.close();
		cn.close();
	}
}
