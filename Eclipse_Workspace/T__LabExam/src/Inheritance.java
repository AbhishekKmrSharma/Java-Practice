
public class Inheritance 
{
	int a;
	int b;
	Inheritance()
	{
		a=30;
		b=30;
		int d=a/b+59;
		System.out.println(d);
	}
	void mul()
	{
		int c=a+b;
		System.out.println(c);
	}
}
class B extends Inheritance
{
	public static void main(String[] args) 
	{
		B obj=new B();
		obj.mul();
	}
}
