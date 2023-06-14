
abstract public class Abstractionn 
{
	void m1()
	{
		System.out.println("Hello World");
	}
	
	abstract void m2();
}

class Ab2 extends Abstractionn
{
	void m2()
	{
		System.out.println("HAHAHAHAHAHA !!!!!!!!!!!!!!!!!");
	}
}

class Ajaa
{
	public static void main(String[] args)
	{
		Ab2 a=new Ab2();
		a.m2();
		a.m1();
	}
}