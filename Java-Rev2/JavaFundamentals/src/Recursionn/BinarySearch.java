package Recursionn;

public class BinarySearch
{
	public static void main(String []args)
	{
		int a[] = new int[] {1, 3, 9, 27, 55, 99};
		int sEle = 92;
		System.out.println("Element is at Psoition : "+search(a, sEle, 0, a.length -1));
	}
	
	static int search(int[] a, int sEle, int s, int e)
	{
		if(s > e)
		{
			return -1;
		}
		int m = (s + e) / 2;
		
		if(a[m] == sEle)
		{
			return m;
		}
		if(a[m] > sEle)
		{
			return search(a, sEle, s, m - 1);
		}
		return search(a, sEle, m + 1, e);
	}
}
