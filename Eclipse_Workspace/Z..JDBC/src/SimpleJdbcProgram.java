import java.sql.*;
public class SimpleJdbcProgram 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","abhi@123");
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("Select * from t1");
		
		while(rs.next())
		{
		    System.out.println(rs.getInt(1)+" "+rs.getString(2)+rs.getInt(3));
		}
		st.close();
		cn.close();
	}
}
