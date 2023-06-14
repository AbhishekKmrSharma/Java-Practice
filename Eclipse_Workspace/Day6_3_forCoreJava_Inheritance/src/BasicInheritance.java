import java.util.Scanner;
public class BasicInheritance 
{
	int a=20;
	
	static void method1()
	{
		System.out.println("Adding......");;
	}
}
class B extends BasicInheritance
{
	int b=30;
	
	public static void main(String[] args) 
    {
    	B obj=new B();
    	obj.method1();
    	int c=obj.a+obj.b;
    	System.out.println("Final = "+c);
	}
}
