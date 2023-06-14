import java.util.Scanner;
public class ReverseNumber {
	public static void main(String args[])
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter a Number to Reverse = ");
		int a=A.nextInt();
		int b;
		while(a>0)
		{
			b=a%10;
			System.out.print(b+" ");
			a=a/10;
		}
	}

}
