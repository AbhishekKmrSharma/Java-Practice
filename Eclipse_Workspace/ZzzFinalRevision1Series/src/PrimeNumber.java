import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int flag=0;
		
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
