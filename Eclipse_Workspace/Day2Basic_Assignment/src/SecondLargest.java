import java.util.Scanner;
public class SecondLargest {
	public static void Second(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("\n"+"Second largest Element is = "+arr[1]);
	}
public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter how many numbers of elements want to insert = ");
		int size=A.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter element to insert = ");
		for(int i=0;i<size;i++)
		{
			arr[i]=A.nextInt();
		}
		System.out.print("Inserted Elements in array are = ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		Second(arr,size);
		 
	}

}
