import java.util.*;
public class Basics 
{
	int a;
	static int b;
	{
		a=20;
		System.out.println(a);
	}
	static
	{
		System.out.println("i am 2nd");
	}
	
	static
	{
		b=30;
		System.out.println(b);
	}
	Basics()
	{
		System.out.println("I am constructor");
	}
	public static void main(String[] args) 
	{
		Basics obj=new Basics();
		int c=obj.a+obj.b;
		System.out.println(c);
	}
	@Override
	public String toString() 
	{
		System.out.println("STRING");
		return "";
	}
}
