package linkedlist;

public class Operations
{
	Node head;
	
	public void insertAtBegin(int data)
	{
		Node n = new Node(data);
		if(head == null)
		{
			head = n;
			return;
		}
		n.next = head;
		head = n;
	}
	
	public void show()
	{
		Node temp = head;
		if(head == null)
			System.out.println("LL is empty");
		else
		{
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
	public void insertAtLast(int data)
	{
		Node n = new Node(data);
		if(head == null)
		{
			head = n;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = n;
		}
	}
	
	public void reverse()
	{
		Node temp, prev = null;
		Node current = head;
		while(current != null)
		{
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		head = prev;
	}
}
