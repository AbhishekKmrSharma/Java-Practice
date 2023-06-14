import java.util.Scanner;

public class Faboncii 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.print("0 "+"1 ");
		int a1=0;
		int a2=1;
		int a3;
		for(int i=3;i<=a;i++)
		{
			a3=a1+a2;
			System.out.print(a3+" ");
			a1=a2;
			a2=a3;
		}
	}
}
