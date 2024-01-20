package MultiThreading;

public class PriorityThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority()+"Child Thread");
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread().getPriority()+"Child Thread");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getPriority()+"Main Thread");
		PriorityThread t = new PriorityThread();
		t.start();
		System.out.println(Thread.currentThread().getPriority()+"Main Thread");
	}
}
