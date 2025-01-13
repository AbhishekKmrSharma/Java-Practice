package Recursionn;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] {1,3,5,9,27,55,99};
		int sEle = 99;
		System.out.println("Element is Position at : "+search(a, sEle, 0));
	}
	
	static int search(int[] a, int sEle, int index)
	{
		if(index > a.length - 1)
			return -1;
		if(a[index] == sEle)
			return index;
		
		return search(a, sEle, ++index);
	}
}
