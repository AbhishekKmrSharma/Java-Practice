import java.util.Scanner;
public class MaxandminArray {
		public static void max(int arr[], int size)
		{
			System.out.print("Values stored in array are = ");
			for(int i=0;i<size;i++)
			{
				System.out.print(" "+arr[i]);
			}
			int max=arr[0];
			for(int i=1;i<size;i++)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
			System.out.print("\n");
			System.out.print("Maximum value of the Element in the array is = "+max+"\n");
		}
		public static void min(int arr[], int size)
		{
			int min=arr[0];
			for(int i=1;i<size;i++)
			{
				if(min>arr[i])
				{
					min=arr[i];
				}
			}
			System.out.print("Minimum value of Element in the array is = "+min);
		}
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter the number of Elemets want to insert = ");
		int size=A.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the Element to insert = ");
			arr[i]=A.nextInt();
		}
		max(arr, size);
		min(arr, size);
	}

}
