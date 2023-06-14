public class Basics2 
{
	{
		System.out.println("A");
	}
	Basics2()
	{
		System.out.println("A Constructor");
	}
}
class B2 extends Basics2
{
	static
	{
		System.out.println("B");
	}
	B2()
	{
		System.out.println("B constructor");
	}
}
class Yo
{
	public static void main(String[] args) {
		Basics2 a=new B2();
	}
}
