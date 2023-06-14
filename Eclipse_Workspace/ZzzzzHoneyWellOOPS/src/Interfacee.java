
public interface Interfacee 
{
	static void m0()
	{
		System.out.println("I am Static");
	}
	abstract void m1();
	default void m2()
	{
		System.out.println("I am m2");
	}
	private void m3()
	{
		System.out.println("I am m3");
	}
}
class Aa implements Interfacee
{
	public void m1()
	{
		System.out.println("Hello m1");
	}
}

class Zz
{
	public static void main(String[] args) 
	{
		Interfacee i;
		Interfacee.m0();
	}
}
