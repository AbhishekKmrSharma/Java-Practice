package Array;
import java.util.*;

public class Testtt
{
	public static void main(String[] args)  throws Throwable 
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		System.out.print("0"+" "+"1"+" ");
		
		int c1=0,c2=1,c3=0;
		
		for(int i=3;i<=n;i++)
		{
			c3=c1+c2;
			System.out.print(c3+" ");
			c1=c2;
			c2=c3;
		}
	}
}
