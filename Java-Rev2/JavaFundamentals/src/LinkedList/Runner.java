package LinkedList;

public class Runner 
{
	public static void main(String[] args)
	{
		LinkedListMethods list = new LinkedListMethods();
		
		list.show();
		list.insert(10);
		//list.show();
		list.insert(20);
		//list.show();
		list.insert(30);
		list.show();
		list.insertB(40);
		list.insertB(50);
		list.insertB(70);
		list.show();
		list.insertPartPosition(60, 2);
		list.show();
	}
}
