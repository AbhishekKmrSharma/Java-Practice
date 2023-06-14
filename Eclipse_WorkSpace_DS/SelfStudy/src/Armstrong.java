import java.util.Scanner;
public class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		
		System.out.println("Enter Number to Check = ");
		int n=A.nextInt();
		
		int a,b,sum=0;
		int temp=n;
		while(n>0)
		{
			a=n%10;
			b=a*a*a;
			sum+=b;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not");
		}
		
	}
}
