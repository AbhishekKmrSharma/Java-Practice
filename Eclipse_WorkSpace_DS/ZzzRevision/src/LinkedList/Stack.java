package LinkedList;
import java.util.*;

class Node
{
	Node next;
	int data;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}

public class Stack 
{
	static Node head;
	
	static void push(int data)
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
	
	static void pop()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("Underflow");
		}
		else
		{
			head=head.next;
			temp=null;
		}
	}
	
	static void peek()
	{
		if(head==null)
		{
			System.out.println("No Element");
		}
		else
		{
			System.out.println(head.data);
		}
	}
	
	static void show()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		pop();
		peek();
		push(10);
		push(20);
		peek();
		push(30);
		peek();
		show();
		pop();
		peek();
		show();
		
	}
}
