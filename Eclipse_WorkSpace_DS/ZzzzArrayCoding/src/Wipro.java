
public class Wipro 
{
	public static void main(String[] args) 
	{
		int a=2381;
		int b=5430;
		int c=4596;
		int f1=0,f2=0;
		int s1=0,s2=0;
		int t1=0,t2=0;
		
		while(a>0 && b>0 && c>0)
		{
			int r1=a%10;
			int r2=b%10;
			int r3=c%10;
			
			if(f1<r1)
			{
				f2=f1;
				f1=r1;
			}
			else if(r1>=f2)
			{
				f2=r1;
			}
			a=a/10;
			
			if(s1<r2)
			{
				s2=s1;
				s1=r2;
			}
			else if(r2>=s2)
			{
				s2=r2;
			}
			b=b/10;
			
			if(t1<r3)
			{
				t2=t1;
				t1=r3;
			}
			else if(t1<=r3)
			{
				t2=r3;
			}	
			c=c/10;
		}
		System.out.println("Largest "+(s1+f1+t1));
		System.out.println("S_Largest "+(f2+s2+t2));
	}
}
