package mergeTwoLL;

import java.util.LinkedList;

public class Runner 
{
	public static void main(String[] args)
	{
		Node l1 = new Node(10);
		l1.next = new Node(20);
		l1.next.next = new Node(30);
		l1.next.next.next = new Node(40);
		
//		while(l1 != null)
//		{
//			System.out.print(l1.data+" ");
//			l1 = l1.next;
//		}
		
		Node l2 = new Node(5);
		l2.next = new Node(20);
		l2.next.next = new Node(55);
		
		Operations obj = new Operations();
		obj.mergeLL(l1, l2);
		obj.printMerger();
		
		
	}
}
