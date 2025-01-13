package MultiThreading;

public class GetNameSetNameThread 
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Abhishek");
		System.out.println(Thread.currentThread().getName());
	}
}
