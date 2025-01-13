package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BankingAppMethods 
{
	static Scanner sc = new Scanner(System.in);
	final static String url = "jdbc:mysql://localhost:3306/db2024";
	final static String uName = "root";
	final static String pWord = "abhi@123";
	
	
	static void login(int accNo) throws Exception
	{
		String name ="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn = DriverManager.getConnection(url, uName, pWord);
		
		String query = "Select * from data where accNo ="+accNo;
		
		PreparedStatement ps = cn.prepareStatement(query);
		int i = 0;
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			name = rs.getString(3);
			System.out.println(rs.getString(3));
			i++;
		}
		if(i == 0)
		{
			System.out.println("INVALID ACCOUNT NUMBER======TRY AGAINn WITH CORRECT ACCOUNT NUMBER");
			accNo = sc.nextInt();
			login(accNo);
		}
		else
		{
			loginSucces(accNo, name);
		}	
	}
	
	public static void loginSucces(int accNo, String name) throws Exception
	{
		System.out.println("=============Welcome "+name+"==============");
		System.out.println("Choose option");
		System.out.println("1: DEBIT");
		System.out.println("2: CREDIT");
		System.out.println("3: TRANSFER");
		System.out.println("4: EXIT");
		
		
		int option = sc.nextInt();
		
		while(true)
		{
			switch(option)
			{
			case 1:
			{
				debit(accNo);
				break;
			}
			case 2:
			{
				credit(accNo);
				break;
			}
			case 3:
			{
				transfer(accNo);
				break;
			}
			case 4:
			{
				System.out.println("Exited---------Tnankyou !!!");
				System.exit(0);
			}
			default:
			{
				System.out.println("Invalid Option----------Try Again");
				break;
			}
			
			}
		}
	}
	
	public static void debit(int accNo) throws Exception
	{
		Connection cn = DriverManager.getConnection(url, uName, pWord);
		String query = "Select balance from data where accNo = "+accNo;
		PreparedStatement ps = cn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int balance = Integer.parseInt(rs.getString(1));
		System.out.println(balance);
		System.out.println("Enter Amount to Debit : ");
		int wAmount = sc.nextInt();
		if(wAmount > balance)
		{
			System.out.println("Insufficient balance, Available Balance"+balance);
			debit(accNo);
		}
		else
		{
			int newBalance = balance - wAmount;
			String query2 = "update data set balance ="+newBalance+" where accNo ="+accNo;
			System.out.println(query2);
			PreparedStatement ps2 = cn.prepareStatement(query2); 
			ps2.executeUpdate();
			cn.close();
		}
	}
	
	static public void credit(int accNo)
	{
		
	}
	
	static public void transfer(int accNo)
	{
		
	}
}
