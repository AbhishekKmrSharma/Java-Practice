public class Insertion 
{
	public static void main(String[] args) 
	{
		int a[]= {20,50,30,15,5,10,1};
		
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp)
			{
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
