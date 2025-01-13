package DoublyLinkedList;

public class MethodsDLL 
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
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = n;
			n.prev = temp;
		}
	}
	
	void show()
	{
		if(head == null)
		{
			System.out.println("Empty");
		}
		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	void delete()
	{
		Node temp1 = head;
		Node temp2 = null;
		if(head == null)
		{
			System.out.println("Empty");
		}
		else
		{
			while(temp1.next != null)
			{
				temp2 = temp1;
				temp1 = temp1.next;
			}
			temp2.next = null;
			temp1.prev = null;
		}
	}
}
