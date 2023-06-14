
public class Inheritancee 
{
	int a=10;
	int b;
	
	Inheritancee()
	{
		this(10);
		System.out.println("I am default");
	}
	
	Inheritancee(int a)
	{
		this(10,20);
		System.out.println("I am Single = "+a);
	}
	
	Inheritancee(int a, int b)
	{
		System.out.println("I am Double = "+(a+b));
	}
	
	void show(int b)
	{
		System.out.println(("Parent Class" + (a+b)));
	}
	
	public static void main(String[] args) 
	{
		C c=new C();
		c.setD(new D(10,20));
	}
}

class B extends Inheritancee
{
	void show()
	{
		System.out.println("Base class");
	}
}

class C extends B
{
	D d;
	C()
	{
		
	}
	C(D d)
	{
		this.d=d;
	}
	public D getD() {
		return d;
	}
	public void setD(D d) {
		this.d = d;
	}
	void show(int a)
	{
		System.out.println("I am C");
	}
	@Override
	public String toString() {
		return "C [d=" + d + "]";
	}
}
class D
{
	int a;
	int b;
	D(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "D [a=" + a + ", b=" + b + "]";
	}
	
}


















