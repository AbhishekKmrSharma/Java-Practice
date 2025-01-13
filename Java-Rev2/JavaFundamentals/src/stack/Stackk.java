package stack;

public class Stackk 
{
	public static int capacity = 5;
	
	public static void main(String[] args) 
	{
		StackMethods s = new StackMethods();
		int arr[] = new int[capacity];
		
		s.display(arr);
		s.push(arr, capacity, 10);
		s.push(arr, capacity, 20);
		//s.display(arr);
		s.push(arr, capacity, 30);
		s.push(arr, capacity, 40);
		s.push(arr, capacity, 50);
		s.pop();
		s.pop();
		s.pop();
		s.display(arr); //O/P = 10 20
		//s.push(arr, capacity, 10);
		
		for(int i = 0; i < arr.length; i++) // //O/P = 10 20 30 40 50 
			System.out.print(arr[i]+" ");
		
	}
}
