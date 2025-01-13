package MultiThreading;

public class YieldMethod extends Thread
{
	public void run()
	{
		int n = 0;
		while(n <= 5)
		{
			System.out.println(Thread.currentThread().getName()+" "+n);
			n++;
		}
	}
	
	public static void main(String[] args) 
	{
		YieldMethod t1 = new YieldMethod();
		t1.start();
		Thread.yield();
		for(int i = 0; i<=5; i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
