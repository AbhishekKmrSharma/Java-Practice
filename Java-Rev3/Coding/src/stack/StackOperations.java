package stack;

public class StackOperations 
{
	static int top = -1;
	
	public static void push(int arr[], int ele)
	{
		if(top >= arr.length - 1)
		{
			System.out.println("Overflow");
		}
		else
		{
			arr[++top] =  ele;
		}
	}
	
	public static void show(int arr[])
	{
		if(top < 0)
		{
			System.out.println("No Elements");
		}
		else
		{
			for(int i = 0; i <= top; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public static void pop()
	{
		if(top < 0)
			System.out.println("underflow");
		else
			top--;
	}
}
