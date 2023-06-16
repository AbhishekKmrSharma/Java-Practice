import java.sql.*;
import java.util.Scanner;


public class JdbcProject 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception 
	{
		
		System.out.println("==============================Welcome to Banking==============================");
		while(true)
		{
			System.out.println("1. Login");
			System.out.println("2. Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			   case 1:
			   {
				   login();
				   break;
			   }
			   case 2:
			   {
				   System.out.println("Exited, Thankyou !!!!");
				   System.exit(0);
				   break;
			   }
			   default:
			   {
				   System.out.println("Invalid Option");
				   System.out.println("Try Again");
				   break;
			   }
			}
		}
	}
	
	static void login() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartprog","root","abhi@123");
		while(true) 
		{
			System.out.println("Enter Account No: ");
			String accno = sc.next();
			System.out.println("Enter Password: ");
			String pass = sc.next();
			
			String s1 = "select * from register";
			
			PreparedStatement ps = cn.prepareStatement(s1);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				if(rs.getString(2).equals(accno) && rs.getString(3).equals(pass))
				{
					System.out.println("====================Welcome "+rs.getString(1)+"=========================");	
					ps.close();
					cn.close();
					loginSuccess(accno);
				}
			}
			
			System.out.println("Invalid User");
		}
	}
	
	static void loginSuccess(String accno) throws Exception
	{
		while(true)
		{
			System.out.println("Choose Option");
			System.out.println("1. Debit");
			System.out.println("2. Credit");
			System.out.println("3. Transfer");
			System.out.println("4. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			     case 1:
			     {
			    	 debit(accno);
			    	 break;
			     }
			     case 2:
			     {
			    	 credit(accno);
			    	 break;
			     }
			     case 3:
			     {
			    	 transfer(accno);
			    	break; 
			     }
			     case 4:
			     {
			    	System.out.println("Exited, Thankyou !!");
			    	System.exit(0);
			    	break;
			     }
			     default:
			     {
			    	 System.out.println("Invalid Option");
			     }
			}
		}
	}
	
	static void debit(String accno) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartprog","root","abhi@123");
		
		String q1 = "select amount from funds where accNo="+accno;
		
		PreparedStatement ps = cn.prepareStatement(q1);
		ResultSet rs = ps.executeQuery();
		while(true)
		{
			System.out.println("Enter amount to Debit : ");
			
			int debitAmount = sc.nextInt();
			int amount = 0; 
			
			while(rs.next())
			{
				amount = Integer.parseInt(rs.getString(1));
			}
			
			if(amount < debitAmount)
			{
				System.out.println("Sorry Insufficient Balance, Enter Again");
			}
			else
			{
				int result = amount - debitAmount;
				String newAmount = String.valueOf(result);
				String q2 = "update funds set amount="+newAmount+" where accNo="+accno;
				PreparedStatement ps1 = cn.prepareStatement(q2);
				ps1.executeUpdate();
				System.out.println("Debited Successfully, New Fund Updated");
				ps1.close();
				cn.close();
				loginSuccess(accno);
			}	
		}
	}
	
	static void credit(String accno) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartprog","root","abhi@123");
		
		String q1 = "select amount from funds where accNo="+accno;
		
		PreparedStatement ps = cn.prepareStatement(q1);
		ResultSet rs = ps.executeQuery();
		
		System.out.println("Enter amount to Credit : ");
		
		int creditAmount = sc.nextInt();
		int amount = 0; 
		
		while(rs.next())
		{
			amount = Integer.parseInt(rs.getString(1));
		}
		
		int result = amount + creditAmount;
		String newAmount = String.valueOf(result);
		String q2 = "update funds set amount="+newAmount+" where accNo="+accno;
		PreparedStatement ps1 = cn.prepareStatement(q2);
		ps1.executeUpdate();
		System.out.println("Credited Successfully, New Fund Updated");
		ps1.close();
		cn.close();
		loginSuccess(accno);	
	}
	
	static void transfer(String accno) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartprog","root","abhi@123");
		
		String q1 = "select * from funds";
		String tAmount = "";
		String recieverCurrentFund = "";
		
		PreparedStatement ps = cn.prepareStatement(q1);
		ResultSet rs = ps.executeQuery();
		while(true)
		{
			System.out.println("Enter Reciever Account No: ");
			String taccNo = sc.next();
			
			
			while(rs.next())
			{
				if(rs.getString(1).equals(taccNo))
				{
					recieverCurrentFund = rs.getString(2);
					System.out.println("Enter Amount to Transfer");
					tAmount = sc.next();
					break;
				}
			}
			int r1 = Integer.parseInt(recieverCurrentFund);
			int r2 = Integer.parseInt(tAmount);
			int recieverUpdatedFund = r1 + r2; 
			
			String reciverFinal = String.valueOf(recieverUpdatedFund);
			
			String q2 = "update funds set amount="+reciverFinal+" where accNo="+taccNo;
			PreparedStatement ps1 = cn.prepareStatement(q2);
			ps1.executeUpdate();
			
			String q3 = "select amount from funds where accNo="+accno;
			
			PreparedStatement ps3 = cn.prepareStatement(q3);
			ResultSet rs3 = ps3.executeQuery();
			
			String senderFund = "";
			
			while(rs3.next())
			{
				senderFund = rs3.getString(1);
			}
			
			int finalV = Integer.parseInt(senderFund);
			int finalA = Integer.parseInt(tAmount);	
			
			int result = finalV - finalA;
			
			String senderUpdatedFund = String.valueOf(result);
			String q4 = "update funds set amount="+senderUpdatedFund+" where accNo="+accno;
			PreparedStatement ps4 = cn.prepareStatement(q4);
			ps4.executeUpdate();
			System.out.println("Transferred Successfully, New Fund Updated");
			ps1.close();
			cn.close();
			loginSuccess(accno);
		}	
	}
}











