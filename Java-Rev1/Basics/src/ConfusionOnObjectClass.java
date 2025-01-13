
public class ConfusionOnObjectClass extends Inhclass
{
	void m1()
	{
		System.out.println("Hello M1()");
	}
	
	void m2()
	{
		System.out.println("Hello M1()");
	}
	
	public static void main(String[] args)
	{
		Inhclass in = new ConfusionOnObjectClass();
		in.m2();
	}
}


class Inhclass
{
	void m2()
	{
		System.out.println("I am M2");
	}
}
