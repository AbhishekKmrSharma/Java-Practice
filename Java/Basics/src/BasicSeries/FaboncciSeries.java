package BasicSeries;

import java.util.Scanner;

public class FaboncciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("0"+" 1 ");
		int a1 = 0;
		int a2 = 1;
		for(int i = 2;i<n;i++)
		{
			int temp = a1 + a2;
			a1 = a2;
			a2 = temp;
			System.out.print(temp+" ");
		}
	}
}
