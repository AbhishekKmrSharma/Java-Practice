package StartingAgain;

public class HighestElement 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		
		int min=a[0];
		int max=a[0];
		int min1=a[0];
		
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				min=max;
				max=a[i];
			}
			if(a[i]<min1)
			{
				min1=a[i];
			}
		}
		
		System.out.println("Max = "+max+"\n"+"Min = "+min+"\n"+min1);
	}
}
