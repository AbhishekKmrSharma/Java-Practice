package Sorting;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] {55,95,23,41,0,550,1,22,250};
		System.out.print("Before Sorting :");
		for(Integer i : a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a.length - 1 - i; j++)
			{
				if(a[j] > a[j + 1])
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			break;
		}
		System.out.print("After Sorting :");
		for(Integer i : a)
		{
			System.out.print(i+" ");
		}
	}
}
