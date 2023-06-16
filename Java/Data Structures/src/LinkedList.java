
public class LinkedList
{
	Node head;
	
	void insert(int data)
	{
		Node n = new Node(data);
		
		if(head == null)
		{
			head = n;
			return;
		}
		
		Node temp = head;
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		temp.next = n;
	}
	
	void insertB(int data)
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
	
	void insertM(int data,int index)
	{
		Node n = new Node(data);
		Node temp = head;
		
		if(index == 0)
		{
			n.next = head;
			head = n;
			return;
		}
		
		for(int i = 0;i<index -1;i++)
		{
			if(temp == null)
			{
				System.out.println("Index Out of Bound");
				return;
			}
			else
			{
				temp = temp.next;
			}
		}
		n.next = temp.next;
		temp.next = n;
	}
	
	void delete()
	{
		if(head == null)
		{
			System.out.print("Linked List Empty");
			return;
		}
		
		Node temp = head;
		Node sTemp = null;
		
		if(temp.next == null)
		{
			System.out.println("Single Element Deleted");
			head = null;
		}
		else
		{
			while(temp.next != null)
			{
				sTemp = temp;
				temp = temp.next;
			}
			sTemp.next = null;
		}
		
	}
	
	void deleteB()
	{
		if(head == null)
		{
			System.out.println("Empty");
			return;
		}
		
		if(head.next == null)
		{
			head = null;
			System.out.print("Single Element Deleted");
		}
		else
		{
			Node temp = head.next;
			head = temp;
			System.out.print("Deleted at Begin");
		}
		
	}
	
	void show()
	{
		Node temp = head;
		
		if(head == null)
		{
			System.out.print("Linked List Empty"+"\n");
			return;
		}
		
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
}























