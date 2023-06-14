import java.util.Scanner;
public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int a=new Scanner(System.in).nextInt();
		int temp=a,sum=0,r=0;
		while(a>0)
		{
			r=a%10;
			sum=(r*r*r)+sum;
			a=a/10;
		}
		if(sum==temp)
			System.out.println("Armstrong");
		else
			System.out.println("Not");
	}
}
