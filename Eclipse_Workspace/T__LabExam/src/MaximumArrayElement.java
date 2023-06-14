import java.util.Scanner;
public class MaximumArrayElement 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=A.nextInt();
		
		int[] a=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=A.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("largest: "+max);	
		System.out.println("smallest: "+min);
	}
}
