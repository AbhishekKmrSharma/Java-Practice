import java.util.Scanner;
public class PrimeNumber 
{
	void f1(int a)
	{
		int p=0;
		int s=a/2;
		
		for(int i=2;i<=s;i++)
		{
			if(a%i==0)
			{
				p++;
			}
		}
		if(p==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not");
		}
	}
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		
		System.out.println("Enter number to check: ");
		int a=A.nextInt();
		PrimeNumber obj=new PrimeNumber();
		
		obj.f1(a);
	}
}
