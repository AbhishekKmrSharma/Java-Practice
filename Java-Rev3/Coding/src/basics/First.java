package basics;

public class First
{
	int a;
	static int b;
	static 
	{
		System.out.println("Static");
		b =10;
	}
	
	{
		System.out.println("Non Static");
		b = 30;
	}
	
	public First()
	{
		System.out.println(b);
		b = 40;
	}
	public static void main(String[] args) 
	{
		First obj = new First();
		System.out.println(b);
		First obj1 = new First();
		System.out.println(m1("Abhishek","Hello", 10));
	}
	static String m1(String name,String a, int b)
	{
		return name + a;
	}
}


