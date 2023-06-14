import java.util.Scanner;
public class TableMultiplication 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		
		System.out.print("Enter the Number Whose table want to print = ");
		int t=A.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(t+" x "+i+" = "+t*i);
		}
	}
}
