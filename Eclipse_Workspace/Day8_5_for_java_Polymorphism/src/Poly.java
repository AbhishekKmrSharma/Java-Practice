
public class Poly 
{
	int i;
	
	void m1(int i)
	{
		System.out.println("SuperClass= "+this.i);
	}
}
class Poly2 extends Poly
{
	
	void m1()
	{  
		System.out.println("SubClass= "+this.i);
	}
}
class MainPoly
{
	public static void main(String[] args)
	{
		Poly P=new Poly2();
		P.m1(10);
	}
}
