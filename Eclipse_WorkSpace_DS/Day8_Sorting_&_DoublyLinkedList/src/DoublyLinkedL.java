public class DoublyLinkedL 
{
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data=data;
			next=null;
			prev=null;
		}
	}
		
		Node head;
		
		public void insert(int data)
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
			n.prev=temp;
			temp.next=n;
		}
		
		void insertP(int index,int data)
		{
			Node n=new Node(data);
			if(index==0)
			{
				n.next=head;
				head.prev=n;
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
			n.prev=temp;
		}
		
		void del()
		{
			if(head==null)
			{
				System.out.println("Already empty");
			}
			else
			{
				head=head.next;
				head.prev=null;
			}
		}
		
		void delL()
		{
			if(head==null)
			{
				System.out.println("Already Empty");
			}
			else
			{
				Node temp=head;
				if(temp.next==null)
				{
					head=temp.next;
					System.out.println("Single element deleted");
					return;
				}
				
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp=temp.prev;
				temp.next=null;
			}
		}
		
		void delP(int index)
		{
			
			if(head==null)
			{
				System.out.println("Alread empty");
				return;
			}
			if(index==0)
			{
				head=head.next;
			}
			else
			{
				Node temp=head;
				Node stemp=null;
				for(int i=0;i<index-1;i++)
				{
					temp=temp.next;
				}
				stemp=temp.next;
				temp.next=stemp.next;
				stemp=null;
				
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
			System.out.println();
		}
	}

class Runner
{
	public static void main(String[] args) 
	{
		DoublyLinkedL dl=new DoublyLinkedL();
		dl.del();
		dl.insert(10);
		dl.insert(20);
		dl.insert(30);
		dl.insert(40);
		dl.show();
		dl.delL();
		dl.show();
		dl.delP(3);
		dl.show();

	}
}
