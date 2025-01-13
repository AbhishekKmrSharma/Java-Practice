package Array;

public class FirstToLast 
{
	public static void main(String[] args) 
	{
		int a[] = new int[] {4,1,1,1};
		int count = 0;
		int num = a[0];
		
		for(int i = 0; i < a.length; i++)
		{
			if(num == i)
			{
				num += a[i];
				count = i;
				//System.out.println(count);
			}
		}
		if(count == a.length - 1)
		{
			System.out.println("Success");
		}
	}
}
