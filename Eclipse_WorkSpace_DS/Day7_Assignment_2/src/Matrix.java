import java.util.Scanner;
public class Matrix 
{
	public boolean matrixChecker(int a[][],int r,int c)
	{
		int sum = 0; 
        for(int i=0;i<r;i++) 
        {
            sum=sum+a[i][i]; 
        }
    
        for(int i=0;i<r;i++) 
        { 
            int row=0; 
            for(int j=0;j<c;j++) 
                row+=a[i][j]; 
            
            if(row!=sum) 
                return false; 
        } 
  
        for(int i= 0;i<c;i++) { 
  
            int col=0; 
            for (int j=0;j<r;j++) 
                col+=a[j][i]; 
   
            if (sum!=col) 
                return false; 
        } 
  
        return true; 
    } 
}

class MatrixCheck
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		Matrix m=new Matrix();
		
		int r=A.nextInt();
		int c=A.nextInt();
		
		int a[][]=new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("Enter");
				a[i][j]=A.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		if(m.matrixChecker(a,r,c))
		{
			System.out.println("Magic");
		}
		else
		{
			System.out.println("not");
		}

	}
}

//2	7	6	=15
//9	5	1	=15
//4	3	8	=15
//=15	=15	=15	=15