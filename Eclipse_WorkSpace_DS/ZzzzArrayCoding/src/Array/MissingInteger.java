package Array;

public class MissingInteger 
{
	public static void main(String[] args)
	{
		int a[]=new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,19,20,21,18};
		int val=0;
		int sum=a.length+1;
		int sum1=sum*(sum+1)/2;
		int sum2=0;
		for(int i=0;i<a.length;i++)
		{
			sum2+=a[i];
		}
		System.out.println((sum1-sum2));
	}
}
