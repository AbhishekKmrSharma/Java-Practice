package stack;

public class StackMethods 
{
	public static int top = -1;
	
	public void push(int arr[], int capacity, int ele)
	{
		if(capacity -1 > top)
		{
			top++;
			arr[top] = ele;
			System.out.println("Inserted");
		}
		else
		{
			System.out.println("Overflow");
			return;
		}
	}
	
	public void pop()
	{
		if(top < 0)
		{
			System.out.println("Underflow");
		}
		else
		{
			top--;
			System.out.println("Removed");
		}
	}
	
	public void display(int[] arr)
	{
		if(top < 0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			for(int i = 0; i <= top; i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
