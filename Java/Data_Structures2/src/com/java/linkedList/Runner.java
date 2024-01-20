package com.java.linkedList;

public class Runner 
{
	public static void main(String[] args) 
	{
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.size();
		sll.show();
		sll.insert(10);
		sll.insert(20);
		sll.size();
		sll.show();
		sll.insertAtBegin(100);
		sll.insertAtBegin(110);
		sll.show();
		sll.size();
		sll.deleteAtlast();
		sll.deleteAtlast();
		sll.deleteAtlast();
		sll.show();
		sll.size();
	}
}
