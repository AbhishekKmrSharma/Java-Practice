import java.util.Scanner;

public class UserdefinedException extends RuntimeException
{
	UserdefinedException(String message)
	{
		super(message);
	}
}


class Voting
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter Age = ");
		int age=A.nextInt();
		if(age<=18)
		{
			throw new UserdefinedException("Not eligible to vote");
		}
		else
		{
			System.out.println("Eligible");
		}
		System.out.println("Success");
	}
}
