import java.util.Scanner;
public class SimpleException 
{
	public static void main(String []args)
	{
		Scanner x=new Scanner(System.in);
		int a=20;
		int b=x.nextInt();
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("I am in finally block");
		}
		System.out.println("rest code");
	}
}
