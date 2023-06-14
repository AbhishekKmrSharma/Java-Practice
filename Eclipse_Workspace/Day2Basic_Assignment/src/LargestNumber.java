import java.util.*;
public class LargestNumber {
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter First Number = ");
		int a=A.nextInt();
		System.out.print("Enter Second Number = ");
		int b=A.nextInt();
		System.out.print("Enter Third Number = ");
		int c=A.nextInt();
		if((a>b) && (a>c))
		{
			System.out.println(a+" is larger ");
		}
		else if((a<b) && (b>c)) 
	    {
			System.out.println(b+" is larger ");
		}
		else if((c>a) && (c>b))
		{
			System.out.println(c+" is larger");
		}
		else 
		{
			System.out.println("Error-two or three numbers are Equal and larger ");
		}
	}
}
