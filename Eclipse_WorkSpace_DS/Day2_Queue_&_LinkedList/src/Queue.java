public class Queue 
{
	static int[] q=new int[5];
	static int rear;
	static int front;
	static int size;
	
	static void enQueue(int ele)
	{
		if(isFull())
		{
			System.out.print("\nQueue is Full");
		}
		else
		{
		q[(rear)%5]=ele;
		rear++;
		size++;
		}
	}
	
	static void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
		}
		else
		{
		int del=q[front%5];
		front++;
		size--;
		}
	}
	
	static void show()
	{
		System.out.print("\nElements are = ");
		for(int i=0;i<size;i++)
		{
			System.out.print(q[(front+i)%5]+" ");
		}
	}
	
	static boolean isFull()
	{
		return rear>=4;
	}
	
	static boolean isEmpty()
	{
		return rear<=0;
	}
	public static void main(String[] args) 
	{
		deQueue();
		enQueue(10);
		enQueue(20);
		show();
		enQueue(30);
		enQueue(40);
		show();
		deQueue();
		deQueue();
		show();
		deQueue();
		deQueue();
		show();
		enQueue(10);
		enQueue(20);
		show();
		enQueue(30);
		enQueue(40);
		enQueue(50);
		enQueue(60);
		show();
		
		
	}
}
