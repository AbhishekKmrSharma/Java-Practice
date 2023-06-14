import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter a Number to check Even or Odd = ");
		int a=A.nextInt();
		if(a%2==0)
		{
			System.out.println(a+" is Even");
		}
		else
		{
			System.out.println(a+" is Odd ");
		}
	}

}
