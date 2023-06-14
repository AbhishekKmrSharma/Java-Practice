import java.sql.*;
public class JdbcBasic 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection C=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","abhi@123");
		Statement st=C.createStatement();
		ResultSet rt=st.executeQuery("select * from product ");
		
		while(rt.next())
		{
			System.out.println(rt.getInt(1)+" "+rt.getString(2)+" "+rt.getString(3)+" "+rt.getInt(4)+" "+rt.getString(5)+" "+rt.getInt(6));
		}
		Statement st1=C.createStatement();
		String g= "update product set manufacturer = 'HP' where id = 101";
		int rs1=st1.executeUpdate(g);
		
		st.close();
		C.close();
	}
}
