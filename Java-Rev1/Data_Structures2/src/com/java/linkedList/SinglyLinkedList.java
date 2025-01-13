package com.java.linkedList;

public class SinglyLinkedList
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
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = n;
	}
	
	void insertAtBegin(int data)
	{
		Node n = new Node(data);
		
		if(head == null)
		{
			head = n;
			return;
		}
		n.next = head;
		head = n;
	}
	
	void deleteAtlast()
	{
		if(head == null)
		{
			System.out.println("Empty");
			return;
		}
		
		Node temp = head;
		Node sTemp = head;
		
		while(temp.next != null)
		{
			sTemp = temp;
			temp = temp.next;
		}
		sTemp.next = null;
	}
	
	void show()
	{
		if(head == null)
		{
			System.out.println("Empty");
			return;
		}
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	void size()
	{
		int count = 0;
		if(head == null)
		{
			System.out.println("Empty");
			return;
		}
		Node temp = head;
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		System.out.println("Elements Available :"+count);
	}
}












