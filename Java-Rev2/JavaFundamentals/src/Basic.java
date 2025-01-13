
public class Basic 
{
	static int a = 10;
	
	Basic()
	{
		a = 50;
	}
	
	void m1()
	{
		a = 30;
	}
	
	public static void main(String args[])
	{
		//Basic b = new Basic();
		//b.m1();
		System.out.println(a);
	}
}
