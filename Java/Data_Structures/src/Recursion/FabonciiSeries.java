package Recursion;

public class FabonciiSeries 
{
	public static void main(String[] args) 
	{
		int num = 6;
		
		System.out.println(fab(num));
	}
	
	static int fab(int num)
	{
		if(num < 2)
		{
			return num;
		}
		return fab(num -1) + fab(num -2);
		
	}
}
