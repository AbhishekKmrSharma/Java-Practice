import java.util.Scanner;
public class Calculator {
	public static void add()
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter how many Numbers you want to add = ");
		int n=A.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print("Enter number to add = ");
			float b=A.nextFloat();
			sum+=b;		
		}
		System.out.print("Addition of Numbers is = "+sum+"\n");
	}
	public static void sub()
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter first Number = ");
		float a=A.nextFloat();
		System.out.print("Enter Second Number = ");
		float b=A.nextFloat();
		float c=a-b;
		System.out.print("Result is = "+c+"\n");
	}
	public static void mul()
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter first Number = ");
		float a=A.nextFloat();
		System.out.print("Enter Second Number = ");
		float b=A.nextFloat();
		System.out.print("Result is = "+a*b+"\n");
	}
	public static void divide()
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter First number = ");
		float a=A.nextFloat();
		System.out.print("Enter Second Number = ");
		float b=A.nextFloat();
		if(b==0)
		{
			System.out.print(a+" Cannot be Divisble by re-enter the value except "+b);
			b=A.nextFloat();
		}
		System.out.print("Result is = " +a/b+"\n");
	}

	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		int choice=0;
		while(choice!=6)
		{
			System.out.print("1 for Addition\n2 for Subtraction\n3 for Multiplication\n4 for Divide\n");
			choice=A.nextInt();
			switch(choice)
			{
			case 1:
			{
				add();
				break;
			}
			case 2:
			{
				sub();
				break;
			}
			case 3:
			{
				mul();
				break;
			}
			case 4:
			{
				divide();
				break;
			}
			default:
			{
				System.out.println("Invalid Option ");
			}
			}
		}
	}
	
	}

