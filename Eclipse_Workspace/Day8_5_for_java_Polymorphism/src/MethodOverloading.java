
public class MethodOverloading 
{
	static int m1(int a)
	{
		System.out.println(a);
		return a;
	}
	static void m1()
	{
		System.out.println("This is Second");
	}
}
class Mo
{
public static void main(String[] args) {
	MethodOverloading.m1(20);
	System.out.println(MethodOverloading.m1(10));
}
}