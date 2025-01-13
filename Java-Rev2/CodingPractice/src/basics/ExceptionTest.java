package basics;

public class ExceptionTest 
{
	public static void m1()
	{
		System.out.println(10/0);
	}
	public static void m2()
	{
		m1();
	}
	
	public static void main(String[] args) 
	{
		try
		{
			m2();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}
}
