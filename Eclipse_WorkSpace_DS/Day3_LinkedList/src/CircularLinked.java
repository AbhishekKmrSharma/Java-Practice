public class CircularLinked 
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
	
	void insert(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=tail=n;
			return;
		}
		if(head.next==null)
		{
			head.next=n;
			tail=head.next;
			tail.next=head;
		}
		else
		{
			Node temp=head;
			
			while(temp!=tail)
			{
				temp=temp.next;
			}
			temp.next=n;
			tail=n;
			tail.next=head;
		}
	}
	
	void delB()
	{
		if(head==null)
		{
			head=null;
			tail=null;
			System.out.println("no element ");
		}
		else
		{
			head=head.next;
			tail.next=head;
		}
	}
	
	void del()
	{
		if(head==null||head.next==null)
		{
			head=null;
			System.out.println("Linked list is empty or Single element deleted");
		}
		else
		{
			Node temp=head;
			Node stemp=null;
			
			while(temp!=tail)
			{
				stemp=temp;
				temp=temp.next;
			}
			stemp.next=temp.next;
			tail=stemp;
		}
	}
	
	void show()
	{
		Node temp=head;
		if(temp==null)
		{
			System.out.println("Empty");
			return;
		}
		while(temp!=tail)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.print(temp.data);

	}
}

class Checker
{
	public static void main(String[] args) 
	{
		CircularLinked cl=new CircularLinked();
		
		cl.delB();
		cl.del();
		cl.show();
		cl.insert(10);
		cl.insert(20);
		cl.insert(30);
		cl.insert(40);
		cl.insert(50);
		cl.del();
		cl.delB();
		cl.show();
	}
}
