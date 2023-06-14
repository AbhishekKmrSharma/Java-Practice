import java.util.*;
public class Stack 
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
			return;
		}
		else
		{
			n.next=head;
			head=n;
		}
	}
	
	public void deleteAlt()
    {
       if(head==null)
    	   return;
       
       Node temp=head;
       Node stemp;
       
       while(temp.next!=null)
       {
    	   stemp=temp.next;
    	   temp.next=stemp.next;
    	   stemp=null;
    	   if(temp.next==null)
    	   {
    		   break;
    	   }
    	   else
    	   {
    		   temp=temp.next;
    	   }
       }
    }
	
	void display()
	{
		if(head==null)
		{
			return;
		}
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
		Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int data=sc.nextInt();
			s.push(data);
		}
		s.display();
		s.deleteAlt();
		s.display();
		
	}
	
}
