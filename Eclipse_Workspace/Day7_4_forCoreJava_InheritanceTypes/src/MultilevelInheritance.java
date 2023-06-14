import java.util.Scanner;
public class MultilevelInheritance 
{
	int a;
	
	MultilevelInheritance(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	
	void m1()
	{
		
	}
}
class B extends MultilevelInheritance
{
	int b;
	
	B(int a,int b)
	{
		super(a);
		this.b=b;
		System.out.println(b);
	}
	
	void m2()
	{
		
		System.out.println(b);
	}
}
class Caaa extends B
{
	Caaa(int a,int b)
	{
		super(a,b);
	}
	int c;
	
	//C(int a,int b,int c)
	//{
		//super(a,b);
		//this.c=c;
		//System.out.println(c);
	//}
	
	void m3()
	{
		System.out.println(c);
	}
}
class test
{
	public static void main(String[] args) 
	{
		Caaa c=new Caaa(10,20);

		
	}
}
