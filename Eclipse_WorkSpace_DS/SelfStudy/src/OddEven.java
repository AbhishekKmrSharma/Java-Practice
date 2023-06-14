import java.util.Scanner;
public class OddEven 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter a number to check = ");
		int n=A.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
