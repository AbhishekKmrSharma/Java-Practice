package Recursion;

public class LinearS 
{
	public static void main(String[] args)
	{
		int a[] = new int[] {10,20,30,40,50,60,70};
		int target = 100;
		int s = 0;
		int e = a.length - 1;
		System.out.println(linearS(a,target,s,e));
		
	}
	
	static int linearS(int a[], int target, int s, int e)
	{
		if(s>e)
		{
			return -1;
		}
		if(a[s] == target)
		{
			return s;
		}
		return linearS(a,target,s+1,e);
	}
}
