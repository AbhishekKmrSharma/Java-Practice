
public class Duplicate
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10,1,2,3,7,8,9};
		
		int d=0;
		
		for(int i=0;i<a.length;i++)
		{
			d=a[i];
			
			for(int j=i+1;j<a.length;j++)
			{
				if(d==a[j])
				System.out.println(d);
			}
		}
	}
}
