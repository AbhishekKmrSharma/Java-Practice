public class Runner
{
	public static void main(String[] args)
	{
		StackLL l=new StackLL();
		
		l.push(10);
		l.push(20);
		l.push(30);
		l.peek();
		l.push(40);
		l.show();
		l.pop();
		l.pop();
		l.show();
		l.peek();
	}
}
