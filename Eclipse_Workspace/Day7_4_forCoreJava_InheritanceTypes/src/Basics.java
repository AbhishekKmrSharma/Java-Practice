import java.util.Scanner;
class Basics 
{
	int a=20;
	int b;
	float c;
	
	Basics(int b)
	{
		this.b=b;
		System.out.println("SuperClass = "+this.b);
	}

	void m1()
	{
		a=50;
		System.out.println("This is Non Static Method ");
		System.out.println("Hello Abhi "+a);
	}
	void m2()
	{
		a=60;
		System.out.println("This is Static Method "+(a));
	}
}

class Bz extends Basics
{
	int z;
	Bz(int b,int z)
	{
		super(b);
		this.z=z;
		System.out.println("SubClass = "+this.z);
	}
	void m2()
	{
		int b=a;
	}
}
class Cz extends Bz
{
	int x;
	Cz(int b,int z)
	{
		super(b,z);
		x=30;
		System.out.println("Cz = "+x);	
	}
}

 class Result
{
	public static void main(String[] args) 
	{
		Bz a=new Cz(50,10);
		
	}
}

