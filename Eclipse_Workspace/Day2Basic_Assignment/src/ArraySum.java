import java.util.Scanner;
public class ArraySum {
	public static int sum( int arr[],int size)
	{
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter the number of elements want to insert = ");
		int size=A.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter Elements to insert = ");
			arr[i]=A.nextInt();
		}
		int su=sum(arr,size);
		System.out.print("Sum of Array Elements is = "+su);
	}
}
