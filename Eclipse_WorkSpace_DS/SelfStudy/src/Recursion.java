public class Recursion 
{
	public static void main(String[] args) 
	{
		System.out.println("Sum = "+sum(10));
	}
	
	static int sum(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n+sum(n-1);
	}
}
