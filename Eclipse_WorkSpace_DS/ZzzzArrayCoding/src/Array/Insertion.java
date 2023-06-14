package Array;

public class Insertion 
{
	public static void main(String[] args) 
	{
		int a[]= {10,5,8,9,2,1,0};
		
		int temp,j;
		
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=temp;
			}
		}
	}
}
