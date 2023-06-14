import java.util.*;
public class Matrix 
{
	static int indexcolumn; static  int indexrow;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String firstHorizontal;
		String secondVertical;
		
		firstHorizontal=sc.next();
		secondVertical=sc.next();
		
		char[] ch1=firstHorizontal.toCharArray();
		char[] ch2=secondVertical.toCharArray();
		for(int i=0;i<secondVertical.length();i++)
		{
			for(int j=0;j<firstHorizontal.length();j++)
			{
				if(ch1[j]==ch2[i])
				{
					indexcolumn=j;
					indexrow=i;
				}
				
			}
		}
		int u=0;int v=0;
		
		for(int i=0;i<secondVertical.length();i++)
		{
			for(int j=0;j<firstHorizontal.length();j++)
			{
				if(indexcolumn==j)
				{
					System.out.print(ch2[u]+" ");
					u++;
				}
				else if(indexrow==i)
				{
					System.out.print(ch1[v]+" ");
					v++;
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			System.out.print("\n");
		}
		
		
	}

}