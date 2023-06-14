import java.util.*;

public class Inheritance 
{
	int a=10;
	int b=30;
	Inheritance()
	{
		System.out.println("I am inheritancewaa");
	}
	void m1(int a)
	{
		int c=a;
		System.out.println("I am Inheritancewaa Method");	
	}
	void m1()
	{
		System.out.println("I am inheritancewaa method Method");
	}
}

class Mainva extends Inheritance
{
	Mainva()
	{
		System.out.println("i am mainwaa");
	}
	
	void m1()
	{
		super.m1();
		System.out.println("I am Mainwa Method");
	}
	
	public static void main(String[] args) 
	{
		Mainva obj=new Mainva();
		obj.m1();
	}
}
