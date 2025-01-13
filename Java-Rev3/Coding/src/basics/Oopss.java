package basics;

public class Oopss implements Xyz, Abc
{
	public static void main(String[] args)
	{
		Oopss obj = new Oopss();
		obj.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Xyz.super.m1();
	}

	
}

