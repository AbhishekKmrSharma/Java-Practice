package starPattern;

public class Second 
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 4; i++)
		{
			for(int j = 4; j > i + 1; j--)
			{
				System.out.print(" ");
			}
			for(int k = (2*i)+1; k > 0; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 3; i > 0; i--)
		{
			for(int j = 3; j > i - 1; j--)
			{
				System.out.print(" ");
			}
			for(int k = (2 * i) - 1; k > 0; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
