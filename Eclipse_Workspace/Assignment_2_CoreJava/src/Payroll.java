import java.util.Scanner;
public class Payroll 
{
	int a=20;
	String name="Abhishek";
	
	
}
class B extends Payroll
{
	int a[]=new int[3];
	
	public static void main(String[] args) {
		B obj1=new B();

		Payroll obj=new B();
		
		obj1.a[0]=20;
		obj1.a[1]=30;
		obj1.a[2]=40;
		
		System.out.println(obj1.a[0]);
	}
}
