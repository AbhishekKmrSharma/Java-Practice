import java.util.Scanner;
public class Logic 
{
	int a,b,c;
	
	public Logic(int d, int e)
	{
		a=d;
		b=e;
		c=a+b;
		System.out.print(c);
	}
}
class Test
{
	public static void main(String[] args)
	{
		Logic obj=new Logic(10,20); 
	}
}
