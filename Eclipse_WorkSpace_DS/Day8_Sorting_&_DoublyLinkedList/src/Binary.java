public class Binary 
{
	void m1(int a[],int s)
	{
		int mid=0;
		int low=0;
		int high=a.length-1;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			if(a[mid]==s)
			{
				System.out.println(s+"------>>>>>"+mid);
				return;
			}
			else if(a[mid]<s)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		if(low>high)
		{
			System.out.println(s+" not found");
		}
	}
	public static void main(String[] args) 
	{
		Binary b=new Binary();
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int s=1;
		b.m1(a,s);
	}
}
