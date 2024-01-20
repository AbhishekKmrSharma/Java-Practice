package MultiThreading;

public class InterruptedOrIsInterruptedMethods extends Thread 
{
	static Thread t;
	public void run() 
	{
		System.out.println(Thread.currentThread().isInterrupted());
		System.out.println(Thread.interrupted());
		System.out.println(Thread.currentThread().isInterrupted());
		try 
		{
			t.join();
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("Interrupted" + e);
		}
	}

	public static void main(String[] args)
	{
		t = Thread.currentThread();
		//System.out.println(t);
		InterruptedOrIsInterruptedMethods th = new InterruptedOrIsInterruptedMethods();
		th.start();
		th.interrupt();
	}
}
