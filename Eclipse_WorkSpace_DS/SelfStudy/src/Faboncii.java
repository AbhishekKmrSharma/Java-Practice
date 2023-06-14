import java.util.Scanner;
public class Faboncii 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		
		System.out.println("Enter total numbers = ");
		int n=A.nextInt();
		System.out.print("0"+" "+"1"+" ");
		int t1=0;
		int t2=1;
		int t3;
		
		for(int i=2;i<=n;i++)
		{
			t3=t1+t2;
			System.out.print(t3+" ");
			t1=t2;
			t2=t3;
		}
	}
}
