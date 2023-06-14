import java.util.Scanner;
public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		
		System.out.println("Enter number = ");
		int n=A.nextInt();
		
		int sum=0,r=0;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
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
