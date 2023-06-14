import java.util.*;
public class ReverseArray 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		
		System.out.println("Size = ");
		int size=A.nextInt();
		
		int a[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			a[i]=A.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}
