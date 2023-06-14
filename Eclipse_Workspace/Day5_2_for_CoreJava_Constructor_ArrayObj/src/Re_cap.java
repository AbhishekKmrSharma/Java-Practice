import java.util.Scanner;
public class Re_cap 
{
	int a;
	
	Re_cap(int c)
	{
		a=c;
		System.out.println("Constructor");
	}
    static
    {
    	int a=1000;
    	System.out.println("Static block = "+a);
    }
	{
		a=20;
		int b=30;
		int c=300;
		System.out.println("Non Static block");
		System.out.println(a+" "+b+" "+c);
	}
	void m1(int a)
	{
		System.out.println("Superclass");
	}
	
}
class B4 extends Re_cap
{
	B4(int c)
	{
		super(10);
		System.out.println("Subclass Constructor");
	}
	void m1()
	{
		a=50;
	}
}
class now
{
	public static void main(String[] args) {
		Re_cap A = new B4(10);
		A.m1(10);
		System.out.println(A.a);
	}
}