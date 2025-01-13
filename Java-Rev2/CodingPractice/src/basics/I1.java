package basics;

public interface I1 
{
	int a = 10;
	
	void m1();
	
	public static void main(String[] args) 
	{
		I1 i = new C2();
		System.out.println(i.a);
	}
}
class C2 implements I1
{

	@Override
	public void m1() 
	{
		// TODO Auto-generated method stub
		
	}
	
}
