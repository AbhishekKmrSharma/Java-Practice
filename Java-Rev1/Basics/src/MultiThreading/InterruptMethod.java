package MultiThreading;

public class InterruptMethod extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Interupted"+e);
		}
	}
	public static void main(String[] args) 
	{
		InterruptMethod th = new InterruptMethod();
		th.start();
		th.interrupt();
	}
}
