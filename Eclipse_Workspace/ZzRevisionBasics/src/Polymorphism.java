
public class Polymorphism 
{
	int a;
	Polymorphism(int a)
	{
		System.out.println("I am Poly");
		this.a=a;
		System.out.println(a);
	}
	
	void m1()
	{
		System.out.println("first one");
	}
	void m1(int a)
	{
		int b=a;
		System.out.println("second one "+b);
	}
}
class RuntimePoly extends Polymorphism
{
	int a,b;
	
	RuntimePoly(int a)
	{
		super(a);
		System.out.println("Runtime Construct");
	}
	void m1(int a,int b)
	{
		System.out.print("I am Runtime ");
		this.a=a;
		this.b=b;
		System.out.println(a+" "+b);
	}
}
class Calling 
{
	public static void main(String[] args) 
	{
		RuntimePoly p=new RuntimePoly(10);
//		p.m1(10,20);
//		p.m1(10);
		
	}
}
