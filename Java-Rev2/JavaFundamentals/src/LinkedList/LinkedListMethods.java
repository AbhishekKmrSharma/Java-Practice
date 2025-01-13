package LinkedList;

public class LinkedListMethods 
{
	Node head;
	int numEle = 0;
	
	void insert(int data)
	{
		Node n = new Node(data);
		if(head == null)
		{
			head = n;
			numEle++;
			return;
		}
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next  = n;
		numEle++;
	}
	
	void insertB(int data)
	{
		Node n = new Node(data);
		
		if(head == null)
		{
			head = n;
			numEle++;
		}
		else
		{
			n.next = head;
			head = n;
			numEle++;
		}
	}
	
	void insertPartPosition(int data, int index)
	{
		Node n = new Node(data);
		Node temp = head;
		if(head.next == null || head == null)
		{
			
		}
		if(index >= 0 && index < numEle)
		{
			for(int i = 0; i < index; i++)
			{
				temp = temp.next;
			}
		}
		n.next = temp.next;
		temp.next = n;
	}
	
	void show()
	{
		if(head == null)
		{
			System.out.println("LL is Empty");
		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			//System.out.println(numEle);
			System.out.println();
		}
	}
}
