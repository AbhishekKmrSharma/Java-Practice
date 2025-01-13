
public class MultiDarray
{
	public static void main(String[] args)
	{
		int a[][] = new int[3][4];
		//System.out.println(a.length);
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				a[i][j] = (int)(Math.random() * 10);
				//System.out.print(a[i][j]);
			}
		}
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
