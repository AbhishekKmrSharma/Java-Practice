
public class MaxMin
{
	public static void main(String[] args) 
	{
		int[] a= {1,3,4,50,6,7,8,8,8,9,10};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		System.out.println(min+""+max);
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			
			if(min>a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}
}
