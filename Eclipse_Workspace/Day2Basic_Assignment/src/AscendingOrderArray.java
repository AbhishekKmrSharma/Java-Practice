import java.util.Scanner;
public class AscendingOrderArray {
	public static void AscendOrder(int arr[],int size)
	{
		System.out.print("Inserted Elements in array are = ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("\n"+"Array sorted in Ascending order = ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter array Size = ");
		int size=A.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the Element in array = ");
		for(int i=0;i<size;i++)
		{
			arr[i]=A.nextInt();
		}
		AscendOrder(arr,size);
	}

}
