import java.util.Scanner;
public class CharArray 
{
	Scanner A=new Scanner(System.in);
	short a;
	double b;
	char ch[];
	String d[];
	void method1()
	{
		ch=new char[5];
		System.out.print("Enter Value in Char Array = ");
		for(int i=0;i<5;i++)
		{
			ch[i]=A.next().charAt(0);
		}
		System.out.print("ch[] = ");
		for(int i=0;i<5;i++)
		{
			System.out.print(ch[i]+" ");
		}
	}
	void str()
	{
		System.out.print("\nEnter the Size of String Array  = ");
		int size=A.nextInt();
		d=new String[size];
		for(int i=0;i<size;i++)
		{
			d[i]=A.next();
		}
		System.out.print("String[] = ");
		for(int i=0;i<size;i++)
		{
			System.out.print(d[i]+" ");
		}
	}
}
class Char
{
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		CharArray obj=new CharArray();
		obj.method1();
		CharArray obj1=new CharArray();
		obj1.str();
	
	}
}
