package basics;

public class Polymorphismm
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		obj.m1();
	}
	
	void m1()
	{
		System.out.println("Poly m1");
	}
	void m1(int a)
	{
		System.out.println("Poly m1 having args "+a);
	}
}

class Demo extends Polymorphismm
{
	void m1()
	{
		super.m1(10);
		System.out.println("Demo M1");
	}
}
