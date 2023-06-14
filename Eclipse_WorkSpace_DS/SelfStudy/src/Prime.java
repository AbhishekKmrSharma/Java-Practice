import java.util.Scanner;
public class Prime 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.println("Enter a number to check = ");
		int n=A.nextInt();
		int count=0;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not Prime");
				count+=1;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Prime");
		}
	}
}
