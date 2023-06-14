import java.util.Scanner;
public class CallbyValue 
{
	int a=10;
	
	void m1(CallbyValue obj)
	{
		System.out.println(a);
		obj.a+=50;
	}
	void m2(CallbyValue obj)
	{
		System.out.println(obj.a+=100);
	}
}
class test
{
public static void main(String[] args) {
		CallbyValue obj= new CallbyValue();
		obj.m1(obj);
		System.out.println(obj.a);
		obj.m2(obj);
		System.out.println(obj.a);
	}
}
