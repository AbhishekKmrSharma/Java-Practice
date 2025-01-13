package Basic;

public class FirstProgram
{
	static int a;
	static
	{
		System.out.println("I am Static Block");
	}
	{
		System.out.println("I am NON Static Block");
	}
	public static void main(String[] args) 
	{
		Demo2 a = new Demo2();
		/*d.a=10;
		System.out.println(a);*/
	}
	public FirstProgram()
	{
		super();
		System.out.println("I am First Program Constructor");
	}
	public void m1()
	{
		a = 10;
	}
}
class Demo extends FirstProgram
{
	public Demo()
	{
		System.out.println("i am Demo Constructor");
	}
}
class Demo2 extends Demo
{
	Demo2()
	{
		System.out.println("Demo2 Constructor");
	}
}
