public interface Int1 
{
	static int i=20;
	
	abstract void m();
	default void m1()
	{
		System.out.println("Default mrthod");
	}
	static void m2()
	{
		System.out.println("Static Method");
	    
	}
	
	private void m3()
	{
		System.out.println("Private Method");
	}
	public static void main(String[] args) 
	{
		Int1 i=new Int();
		i.m();
		i.m1();
		Int1.m2();
	}

}
class Int implements Int1
{
	public void m()
	{
		System.out.println("Class invoked ");
	}
}
