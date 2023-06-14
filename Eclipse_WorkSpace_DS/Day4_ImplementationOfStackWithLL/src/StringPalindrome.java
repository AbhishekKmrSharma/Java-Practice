import java.util.Scanner;
public class StringPalindrome 
{
	public static void main(String[] args) 
	{
	Scanner A=new Scanner(System.in);
	
	System.out.print("Enter String to Check Palindrome or not = ");
	String s=A.next();
	String r="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		r=r+s.charAt(i);
	}
	
	if(s.equals(r))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
	}
}
