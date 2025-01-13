package Array;

public class SecondMinMax 
{
	public static void main(String[] args) 
	{
		int a[] = {20,30,55,285,1,156,3,4,136,98};
		int max = 0, sMax = 0;
		int min = a[0], sMin = a[0];
		
		for(int i = 0; i < a.length; i++)
		{
			if(max < a[i])
			{
				sMax = max;
				max = a[i];
				//System.out.println("1");
			}
			else if(sMax < a[i])
			{
				sMax = a[i];
			}
			
			if(min > a[i])
			{
				sMin = min;
				min = a[i];
			}
			else if(sMin > a[i] && min < a[i])
			{
				sMin = a[i];
			}
		}
		System.out.println("Second Max = "+sMax);
		System.out.println("Second Max = "+sMin);
	}
}
