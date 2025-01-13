package sortLL;

public class SortOperation
{
	
	
	public static void main(String[] args)
	{
		Node n = new Node(31);
		n.next = new Node(200);
		n.next.next = new Node(13);
		n.next.next.next = new Node(0);
		n.next.next.next.next = new Node(2);
		show(n);
		sortLL(n);
		show(n);
	}
	
	static void sortLL(Node n)
	{
		Node temp1 = n;
		
		while(temp1 != null)
		{
			Node current = temp1.next;
			
			while(current != null)
			{
				//Node temp2 = current.next;
				if(current.data < temp1.data) // 10 < 20
				{
					int temp3 = current.data; // temp3 = 10
					current.data = temp1.data; // 20
					temp1.data = temp3; // 10
				}
				current = current.next;
			}
			
			temp1 = temp1.next;
		}
	}
	
	static void show(Node n)
	{
		Node temp = n;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}

class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data = data;
		next = null;
	}
}
