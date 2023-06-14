import java.util.Scanner;
public class TwoDimensionalArray 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		int row=A.nextInt();
		int col=A.nextInt();
		int a[][]=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=A.nextInt();
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
