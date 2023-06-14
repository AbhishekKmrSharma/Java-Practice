
public interface RevInterface 
{
	static void m1()
	{
		System.out.println("Hello Jiiiiiiiiiiiiiiiii");
	}
	
	default void m2()
	{
		System.out.println("Default syaing Hello");
	}
	
	private void m3()
	{
		System.out.println("private syaing Hello");
	}
	
	int m4(int a);
	String m5(String str);
	float m6(float f);
	void m7();
}

class InterfaceCheck implements RevInterface
{
	public void m7()
	{
		System.out.println("m7");
	}
	public int m4(int a)
	{
		int b=a;
		System.out.println("m4");
		return b;
	}
	
	public String m5(String str)
	{
		String s=str;
		System.out.println("m5");
		return s;
	}
	
	public float m6(float b)
	{
		float f=b;
		System.out.println("m6");
		return f;
	}
}

class IntCalling
{
	public static void main(String[] args) 
	{
		RevInterface r=new InterfaceCheck();
		
		RevInterface.m1();
		r.m2();
		r.m4(10);
		r.m5("Abhi");
		r.m6(10.25f);
		r.m7();
	}
}
























