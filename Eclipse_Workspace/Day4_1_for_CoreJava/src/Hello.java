
public class Hello {
	int a=10;
	static int b=30;
	
	void m1()
	{
		System.out.println(a);
	}
	static void m2()
	{
		System.out.println(b);
	}
}
class calling
{
	public static void main(String[] a) {
		Hello obj=new Hello();
		obj.m1();
		obj.m2();
	}
}