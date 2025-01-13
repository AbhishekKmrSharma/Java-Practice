package stack;

public class Runner 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[5];
		StackOperations.pop();
		StackOperations.show(arr);
		StackOperations.push(arr, 10);
		StackOperations.push(arr, 20);
		StackOperations.push(arr, 30);
		StackOperations.push(arr, 40);
		StackOperations.push(arr, 50);
		StackOperations.show(arr);
		StackOperations.push(arr, 10);
		StackOperations.pop();
		StackOperations.pop();
		StackOperations.pop();
		StackOperations.pop();
		StackOperations.pop();
		StackOperations.pop();
		StackOperations.show(arr);
		
	}
}
