package com.stackk;

public class Stack_array 
{
	
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		
		Stack_methods s = new Stack_methods();
		
		s.peek(a);
		s.push(a,10);
		s.push(a,20);
		s.peek(a);
		s.push(a,30);
		s.peek(a);
		s.display(a);
		s.pop();
		s.pop();
		s.display(a);
		s.pop();
		s.pop();
		s.peek(a);
		
	}
}
