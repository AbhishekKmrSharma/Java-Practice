package ReTechnical;

public class Oopss 
{
	HasA a;
	
	public static void main(String[] args) 
	{
		Oopss o = new Oopss();
//		o.a(new HasA(10,"Abhi"));
	}
}

class HasA
{
	int b;
	String s;
	
	HasA(int b,String s)
	{
		this.b=b;
		this.s=s;
	}
	
	public String toString()
	{
		return (b+" "+s);
	}
}
