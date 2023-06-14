package StartingAgain;

import java.util.Scanner;

public class AllSeries 
{
	static void prime(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
	
	static void palindrome(int n)
	{
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
	static void max(int a[])
	{
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Element = "+max);
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
//		int n=s.nextInt();
		int a[]= {1,2,3,9,0,8,7,3,4,2,5};
//		prime(n);
//		palindrome(n);
		
		max(a);
	}
	
}
