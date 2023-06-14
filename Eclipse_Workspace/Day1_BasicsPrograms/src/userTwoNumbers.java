import java.util.Scanner;
public class userTwoNumbers {
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter the value of first number = ");
		int a=A.nextInt();
		System.out.print("Enter the value of second number = ");
		int b=A.nextInt();
		int sum=a+b;
		System.out.println("Addition of "+a+" and "+b+" is = "+sum);
	}

}
