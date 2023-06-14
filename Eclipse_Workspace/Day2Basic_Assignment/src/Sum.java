import java.util.Scanner;
public class Sum {
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter the digit to Sum = ");
		int a=A.nextInt();
		int sum=0,b;
		while(a>0)
		{
			b=a%10;
			sum+=b;
			a=a/10;
		}
		System.out.println("Sum of digits is = "+sum);
	}
}
		
