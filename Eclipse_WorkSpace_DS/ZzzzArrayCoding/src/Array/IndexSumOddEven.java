package Array;
import java.util.*;

public class IndexSumOddEven 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size = ");
		int n=s.nextInt();
		int a[]=new int[n];
		int odd = 0,even=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=1;i<n;i++)
		{
			if(i%2==0)
			{
				even+=a[i];
			}
			else
			{
				odd+=a[i];
			}
		}
		System.out.println("Odd Sum = "+odd);
		System.out.println("Even Sum = "+even);
	}
}
