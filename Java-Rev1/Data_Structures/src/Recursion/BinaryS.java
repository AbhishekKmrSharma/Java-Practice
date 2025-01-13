package Recursion;

public class BinaryS 
{
	public static void main(String[] args)
	{
		int a[] = new int[] {10,24,54,89,90,99};
		int target = -1;
		int s = 0;
		int e = a.length - 1;
		System.out.println(binaryS(a, target, s, e));
	}
	
	static int binaryS(int a[], int target, int s, int e)
	{
		if(s > e)
		{
			return -1;
		}
		int m = s + (e-s)/2;
		
		if(a[m] == target)
		{
			return m;
		}
		
		if(a[m] > target)
		{
			return binaryS(a,target,s,m-1);
		}
		return binaryS(a, target, s+1, e);
	}
}






