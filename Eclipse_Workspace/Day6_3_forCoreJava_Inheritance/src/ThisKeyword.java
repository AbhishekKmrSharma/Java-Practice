import java.util.Scanner;
public class ThisKeyword 
{
	int a;
	double b;
	
	ThisKeyword(int a, double b)
	{
		this.a=a;
		this.b=b;	
		System.out.println(a+" "+b);
		this.m1(10,20);
	}
	
	void m1(int a,int b)
	{
		int c=a+b;
		System.out.println(this.a+" "+this.b+" "+c);
	}
}
class ThisKeywordTest
{
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword(52,30.5);
	}
}
