package Array;
import java.util.*;

public class Stack 
{
	static int top=-1;
	static void push(int a[],int data,int n)
	{
		if(top>=n)
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			a[top]=data;
		}
	}
	
	static void pop(int a[])
	{
		if(top<0)
		{
			System.out.println("Underflow");
		}
		else
		{
			a[top]=0;
			top--;
		}
		
	}
	
	static void show(int a[])
	{
		if(top<0)
		{
			System.out.println("Underflow");
		}
		else
		{
			for(int i=0;i<=top;i++)
			{
				System.out.println("Available Elements = "+a[i]);
			}
		}
	}
	
	static void peek(int a[])
	{
		if(top<0)
		{
			System.out.println("No Elements available");
		}
		else
		{
			System.out.println("Peek Element = "+a[top]);
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array Size");
		int n=s.nextInt();
		int a[]=new int[n];
		peek(a);
		show(a);
		pop(a);
		push(a,10,n);
		push(a,20,n);
		push(a,30,n);
		show(a);
		peek(a);
		pop(a);
		show(a);
		peek(a);
	}
}



















