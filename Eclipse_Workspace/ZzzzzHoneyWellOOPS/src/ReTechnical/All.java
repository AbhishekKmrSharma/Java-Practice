package ReTechnical;

public class All 
{
	int a,b,c;
	
	All()
	{
		System.out.println("Parent Default constructor");
	}
	All(int a,int b,int c)
	{
		this(a,b);
		this.c=c;
		System.out.println("C value"+c);
	}
	All(int a,int b)
	{
		this(a);
		this.b=b;
		System.out.println("B value"+b);
	}
	All(int a)
	{
		this.a=a;
		System.out.println("A value"+a);
	}
	
	void m1(int d)
	{
		int e=d;
		System.out.println("Parent class"+e);
	}
	
	public static void main(String[] args)
	{
		All a=new All(10,20,30);
	}
}

//class B extends All
//{
//	B(int a,int b,int c)
//	{
//		super(a,b,c);
//		System.out.println("Subclass constructor");
//	}
//	
//	void m1(int d)
//	{
//		super(d);
//		System.out.println("Subclass Method"+a);
//	}
//	
//	
//}





