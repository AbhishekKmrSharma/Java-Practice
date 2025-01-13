package basics;

abstract public class Oopss
{
	public static void main(String[] args) 
	{
//		Oopss o = new Oopss();
//		o.m1();
		C1 obj = new C1();
		obj.m1();
	}
	
	public void m1()
	{
		System.out.println("M1");
	}
	public void m1(int a)
	{
		System.out.println("M1 with args");
	}
}
class C1 extends Oopss
{
	public void m1()
	{
		super.m1();
		System.out.println("C1 M1");
	}
}
