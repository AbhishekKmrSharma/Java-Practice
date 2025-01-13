package Sorting;

public class SelectionSort 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] {25,2,89,98,23,1,55};
		
		for(int i = 0;i < a.length; i++)
		{
			for(int j = i +1;j < a.length; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(Integer i: a)
		{
			System.out.print(i+" ");
		}
	}
	
}
