package ReTechnical;

import java.util.Scanner;

public class Series 
{
	static int a;
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Series o=new Series();
		o.a=10;
		System.out.println(o.a);
		String s1="Madam";
		
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2+=s1.charAt(i);
		}
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
