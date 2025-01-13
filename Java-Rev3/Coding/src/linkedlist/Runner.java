package linkedlist;

public class Runner
{
	public static void main(String[] args)
	{
		Operations obj = new Operations();
		
		obj.show();
		obj.insertAtBegin(10);
		obj.insertAtBegin(20);
		obj.insertAtLast(30);
		obj.show();
		System.out.print("=================");
		obj.insertAtLast(40);
		obj.insertAtLast(50);
		obj.show();
		System.out.print("=================");
		obj.reverse();
		obj.show();
	}
}
