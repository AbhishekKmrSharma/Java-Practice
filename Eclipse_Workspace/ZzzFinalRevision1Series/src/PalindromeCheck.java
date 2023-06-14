import java.util.Scanner;

public class PalindromeCheck 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0,r=0;
		int temp=a;
		
		while(a>0)
		{
			r=a%10;
			sum=(sum*10)+r;
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
