import java.util.Scanner;
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		int[] a= {10,20,30,40,50,60,70,80,90,100};
		int x=0;
		int y=a.length-1;
		System.out.print("Enter Element to check = ");
		int temp=A.nextInt();
		int mid = 0;
		
	    while(x<=y)
		{
			mid=(x+y)/2;
			if(temp==a[mid])
			{
				System.out.println(temp+" Present at index = "+mid);
				return;
			}
			else if(temp<a[mid])
			{
				y=mid-1;
			}
			else
			{
				x=mid+1;
			}
		}
	    if(x>y)
	    {
	    	System.out.println("Element not present");
	    }
	}
}
