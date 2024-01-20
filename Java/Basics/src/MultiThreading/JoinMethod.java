package MultiThreading;

public class JoinMethod extends Thread
{
	static Thread t; // used to store the reference main thread
	public void run()
	{
		try
		{
			t.join(); // for main thread to execute first
			for(int i= 0; i<5; i++)
			{
				System.out.println("User Thread"+ i );
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
			{
			
			}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		t = Thread.currentThread();
		JoinMethod j = new JoinMethod();
		j.start();
		//t.join();
		try
		{
			for(int i= 0; i<5; i++)
			{
				System.out.println("Main Thread"+ i );
				Thread.sleep(1000);
				//t.join();
			}
		}
		catch(Exception e)
			{
			
			}
	}
}












