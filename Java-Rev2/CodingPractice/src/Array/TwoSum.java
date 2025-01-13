package Array;

public class TwoSum 
{
	public static void main(String[] args)
	{
		int a[] = {2,4,8,10};
		int target = 181;
		int flag = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i + 1;j < a.length; j++)
			{
				if(a[i] + a[j] == target)
				{
					System.out.println("Target Found by Combining elements at index = ["+i+","+j+"]");
					flag += 1;
					return;
				}	
			}
		}
		if(flag == 0)
			System.out.println("Not found");
	}
}
