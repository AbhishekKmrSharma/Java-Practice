package Array;

public class DuplicateInteger 
{
	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,4,5,5,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&&i!=j)
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
}
