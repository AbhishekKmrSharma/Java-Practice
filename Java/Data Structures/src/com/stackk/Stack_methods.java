package com.stackk;

public class Stack_methods
{
	static int top = -1;
	
	void push(int a[],int ele)
	{
		if(isFull())
		{
			System.out.println("Stack is Full");
		}
		else
		{
			top++;
			a[top]=ele;
		}
	}
	
	void pop()
	{
		if(isEmpty())
		{
			System.out.print("Stack is already Empty, Underflow");
		}
		else
		{
			top--;
		}
		System.out.println();
	}
	
	void peek(int a[])
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println(a[top]);
		}
	}
	
	static boolean isFull()
	{
		return top>=4;
	}
	
	static boolean isEmpty()
	{
		return top<0;
	}
	
	void display(int a[])
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}







