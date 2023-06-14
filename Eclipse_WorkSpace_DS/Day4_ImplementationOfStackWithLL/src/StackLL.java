public class StackLL 
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
	
	void push(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	
	void pop()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("Empty");
			return;
		}
		head=temp.next;
		temp=null;
	}
	
	void peek()
	{
		if(head==null)
		{
			System.out.println("Empty");
			return;
		}
		
		System.out.println(head.data);
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
