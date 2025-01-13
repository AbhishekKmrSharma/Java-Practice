package MultiThreading;

public class Basic extends Thread
{
	public void run()
	{
		int count = 0;
		while(count < 21)
		{
			System.out.println("Basic Class"+count);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
	}
	public static void main(String[] args) 
	{
		Basic t1 = new Basic();
		t1.start();
		C2 t2 = new C2();
		t2.start();
	}
}
class C2 extends Thread
{
	public void run()
	{
	int count = 0;
		while(count<21)
		{
			System.out.println("C2 class"+count);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
	}
}
