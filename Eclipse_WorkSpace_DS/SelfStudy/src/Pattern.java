public class Pattern 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i-1;j--)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
