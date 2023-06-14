public class QueueLL 
{
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	Node head;
	Node tail;
	
	void enQueue(int data)
	{
		Node n=new Node(data);
		
		if(head==null)
		{
			head=tail=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	
	void deQueue()
	{
		Node temp=head;
		Node s=null;
		
		if(temp==null)
		{
			System.out.println("Empty");
			return;
		}
		if(temp.next==null)
		{
			temp=tail=null;
			System.out.println("Single Element Deleted");
		}
		else
		{
			while(temp.next!=null)
			{
				s=temp;
				temp=temp.next;
			}
		}
		s.next=temp.next;
		tail=s;
		temp=null;
	}
	
	void peek()
	{
		Node temp=head;
		
		if(temp==null)
		{
			System.out.println("Empty");
			return;
		}
		
		while(temp.next!=null)
			{
				temp=temp.next;
			}
		System.out.println("Peek = "+temp.data);
	}
	
	void show()
	{
		Node temp=head;

		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}
