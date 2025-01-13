package JDBC;

import java.util.Scanner;

public class BankingApp
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception
	{
		System.out.println("=============Welcome to Banking==============");
		System.out.println("Choose option");
		System.out.println("1: LOGIN");
		System.out.println("2: EXIT");
		
		int option = sc.nextInt();
		
		while(true)
		{
			switch(option)
			{
			case 1:
			{
				System.out.println("Enter Account Number : ");
				int accNo = sc.nextInt();
				BankingAppMethods.login(accNo);
				break;
			}
			case 2:
			{
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("INVALID OPTION======================TRY AGAIN !!!");
				break;
			}
			}
		}
	}
}
