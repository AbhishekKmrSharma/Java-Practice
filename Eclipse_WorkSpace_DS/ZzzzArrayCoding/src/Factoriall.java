import java.util.Scanner;

public class Factoriall 
{
	int a=1;
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		Factoriall f=new Factoriall();
		System.out.println(f.m1(n));;
	}
	
	int m1(int n)
	{
		if(n>1)
		{
			a*=n;
			m1(n-1);
		}
		return a;
		
	}
}
