
public class SecondLargest 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9,0};
		int l=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE-1;
		int sm=Integer.MAX_VALUE;
		int s_sm=Integer.MAX_VALUE-1;
		
		for(int i=0;i<a.length;i++)
		{
			if(l<a[i])
			{
				sl=l;
				l=a[i];
			}
			
			if(sm>a[i])
			{
				s_sm=sm;
				sm=a[i];
			}
		}
		
		System.out.println(l+" "+sl+" "+sm+" "+s_sm);	
	}
}
