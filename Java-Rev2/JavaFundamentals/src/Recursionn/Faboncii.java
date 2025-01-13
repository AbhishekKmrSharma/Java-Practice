package Recursionn;

public class Faboncii
{
	public static void main(String[] args)
	{
		int n = 2;
		System.out.println(fn(n));
	}
	
	static int fn(int n)
	{
		if(n < 2)
		{
			return n;
		}
		return fn(n-1) + fn(n-2);
	}
}
