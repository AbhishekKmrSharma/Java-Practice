
public class Demo
{
	private int a;
	private int b;
	private int c;
	
	public Demo(int a)
	{
		this.a = a;
		System.out.println("called");
	}
	
	public static void main(String[] args)
	{	
		Demo ab = new Demo(10);
		System.out.println(ab.a);
	}
}
