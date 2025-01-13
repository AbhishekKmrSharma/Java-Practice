package mergeTwoLL;

public class Operations 
{
	Node dummy = new Node(0);
	Node mergeLL = dummy;
	
	public void mergeLL(Node l1, Node l2)
	{
		Node temp1 = l1;
		Node temp2 = l2;
		
		while(temp1 != null && temp2 != null)
		{
			if(temp1.data <= temp2.data)
			{
				mergeLL.next = temp1;
				temp1 = temp1.next;
			}
			else
			{
				mergeLL.next = temp2;
				temp2 = temp2.next;
			}
			mergeLL = mergeLL.next;
		}
		
		if(temp1 != null)
		{
			mergeLL.next = temp1;
		}
		else
		{
			mergeLL.next = temp2;
		}
		dummy = dummy.next;
	}
	
	public void printMerger()
	{
		while(dummy != null)
		{
			System.out.print(dummy.data+" ");
			dummy = dummy.next;
		}
	}
}
