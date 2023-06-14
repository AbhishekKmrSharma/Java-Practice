
abstract public class Abstraction1 
{
	Abstraction1()
	{
		System.out.println("Hello Abhi");
	}
	abstract void show(int a);
}

class A extends Abstraction1
{
	void show(int a)
	{
		System.out.println("Hello Method");
	}
}
class Cc
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.show(10);
	}
}
