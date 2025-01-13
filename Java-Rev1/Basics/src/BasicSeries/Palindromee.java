package BasicSeries;

import java.util.Scanner;

public class Palindromee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to check Palindrome: ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while(n > 0)
		{
			int r = n%10;
			sum = (sum * 10) + r;
			n = n/10;
		}
		if(temp == sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
