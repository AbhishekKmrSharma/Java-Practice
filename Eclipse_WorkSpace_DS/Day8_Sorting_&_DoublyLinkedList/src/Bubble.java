import java.util.Scanner;
public class Bubble 
{
	void m1(int a[])
	{
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				int temp=0;
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}			
			}
			if(flag==1)
			{
				
			}
			else
			{
				System.out.println("Already sorted");
				break;
			}
			for(int ac:a)
			{
				System.out.print(ac+" ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) 
	{
		int a[]= {20,165,100,32,58,125,1};
		
		for(int ab:a)
		{
			System.out.print(ab+" ");
		}
		System.out.println();
		
		new Bubble().m1(a);
	}
}
