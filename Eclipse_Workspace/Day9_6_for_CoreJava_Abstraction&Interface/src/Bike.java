
public abstract class Bike
{
    int a;	
	abstract void run();
	
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Abstract Method Invoked ");
	}
}
class AbstCalling
{
	public static void main(String[] args) {
		Bike a=new Honda();
		a.run();
		a.a=10;
		System.out.println(a.a);
	}
}