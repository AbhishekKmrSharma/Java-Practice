public class LinkedList 
{
	Node head;
	
	void insert(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;	
	}
	
	void insertB(int data)
	{
		Node n=new Node(data);
		n.next=head;
		head=n;
	}
	
	void insertAny(int index,int data)
	{
		Node n=new Node(data);
		if(index==0)
		{
			n.next=head;
			head=n;
			return;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;	
	}
	
	void delB()
	{
		if(head==null)
		{
			System.out.print("Empty");
		}
		else
		{
		Node temp=head;
		temp=temp.next;
		head=temp;
		}
	}
	
	void delL()
	{
		if(head==null)
		{
			System.out.print("\nEmpty");
			return;
		}
		
		Node temp=head;
		Node slast=null;
		if(temp.next==null)
		{
			head=temp.next;
			System.out.println("Single Element Deleted");
		}
		else
		{
			while(temp.next!=null)
			{
				slast=temp;
				temp=temp.next;
			}
			slast.next=temp.next;	
		}		
	}
	
	void delAny(int index)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
			return;
		}
		if(index==0)
		{
			head=head.next;
			System.out.println("Deleted ");
		}
		else
		{
			try {
			Node temp=head;
			Node temp1;
			for(int i=0;i<index-1;i++)
			{
				temp=temp.next;
			}
			temp1=temp.next;
			temp.next=temp1.next;
			temp1=null;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	void show()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
