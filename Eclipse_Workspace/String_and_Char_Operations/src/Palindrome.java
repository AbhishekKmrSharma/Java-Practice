import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		
		String s=A.next();
		
		String s2="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			s2+=s.charAt(i);
		}
		System.out.println(s2);
		
		if(s.equalsIgnoreCase(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
