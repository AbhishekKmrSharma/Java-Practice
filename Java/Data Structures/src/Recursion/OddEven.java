package Recursion;

public class OddEven 
{
	public static void main(String[] args) 
	{
		int n = 1001;
		int countOdd = 0;
		int countEven = 0;
		System.out.println(oddEven(n,countOdd,countEven));
	}
	
	static String oddEven(int n,int countOdd, int countEven)
	{
		if(n <= 0)
		{
			return countEven+"\n"+countOdd;
		}
		
		if(n%2 == 0)
		{
			countEven++;
		}
		else
		{
			countOdd++;
		}
		
		return oddEven(n-1,countOdd,countEven);
	}
}
