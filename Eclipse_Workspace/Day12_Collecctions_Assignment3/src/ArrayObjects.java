import java.util.ArrayList;
import java.util.Scanner;
public class ArrayObjects 
{
	int a;
	String name;
	
	void m1(int b,String c)
	{
		a=b;
		name=c;
	}
	public String toString()
	{
		return (a+" "+name);
	}
}
class Test1
{
	public static void main(String[] args) {
		ArrayObjects obj1=new ArrayObjects();
		obj1.m1(10,"Hello");
		ArrayObjects obj2=new ArrayObjects();
		obj2.m1(20,"Hello2");
		ArrayObjects obj3=new ArrayObjects();
		obj3.m1(30,"Hello3");
		ArrayList<Object> A=new ArrayList<>();
		A.add(obj1);
		A.add(obj2);
		A.add(obj3);
		try {
		System.out.println(A.get(2));
		}
		catch(Throwable a)
		{
			System.out.println("Array out of bound");
		}
		System.out.println("Rest Code");
		
	}
}
