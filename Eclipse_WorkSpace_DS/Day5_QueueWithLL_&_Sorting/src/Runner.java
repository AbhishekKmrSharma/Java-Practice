public class Runner 
{
	public static void main(String[] args) 
	{
		QueueLL l=new QueueLL();
		
		l.enQueue(10);
		l.enQueue(20);
		l.enQueue(30);
		l.enQueue(40);
		l.peek();
		l.show();
		l.deQueue();
		l.deQueue();
		l.show();
		l.peek();
	}
}
