import java.util.Scanner;
public class ReverseArray {
	public static void reverse(int arr[],int size)
		{
		    System.out.print("Values Stored in Array is = ");
			for(int i=0;i<size;i++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.print("\n");
			int start=0;
			if(start>=size-1)
				{
					System.out.print("Array has only one Element \n");
				}
			else
				{
				  System.out.print("Reverse of an array = ");
					for(int i=size-1;i>=0;i--)
					{
						System.out.print(arr[i]+" ");
					}
				}
		}
	
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter the number of Elements want to insert = ");
		int size=A.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the element = ");
		for(int i=0;i<size;i++)
		{
			arr[i]=A.nextInt();
		}
		reverse(arr,size);
	}

}
