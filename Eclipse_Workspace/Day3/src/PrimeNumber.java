import java.util.Scanner;
public class PrimeNumber {
	public static void Prime(int num)
	{
		int flag=0;
		int m=num/2;
		for(int i=2;i<=m;i++)
		{
			if(num%i==0)
			{
				System.out.print(num+" is not Prime");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.print(num+" is Prime");
		}
	}
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter the number to check Prime or not = ");
		int num=A.nextInt();
		Prime(num);
	}
}
