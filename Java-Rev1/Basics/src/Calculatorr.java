import java.util.Scanner;

public class Calculatorr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		CalcMethods obj = new CalcMethods();
		
		while(true)
		{
			System.out.println("Enter Choice");
			System.out.println("1: Addition");
			System.out.println("2: Subtraction");
			System.out.println("3: Multiplication");
			System.out.println("4: Divide");
			System.out.println("5: Exit");
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			    case 1:
			    {
			    	obj.addition();
			    	break;
			    }
			    case 2:
			    {
			    	obj.subtraction();
			    	break;
			    }
			    case 3:
			    {
			    	obj.multiplication();
			    	break;
			    }
			    case 4:
			    {
			    	obj.divide();
			    	break;
			    }
			    case 5:
			    {
			    	System.out.println("Exited");
			    	System.exit(0);
			    }
			    default:
			    {
			    	System.out.println("Invalid Choice");
			    }
			}
		}
	}
}


class CalcMethods
{
	Scanner s = new Scanner(System.in);
	void addition()
	{
		System.out.println("Enter two number to add: ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Result is "+(a+b));
	}
	
	void subtraction()
	{
		System.out.println("Enter two number to subtract: ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Result is "+(a-b));
	}
	
	void multiplication()
	{
		System.out.println("Enter two number to Multi: ");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println("Result is "+a*b);
	}
	
	void divide()
	{
		System.out.println("Enter two number to divide: ");
		float a = s.nextFloat();
		float b = s.nextFloat();
		if(a>0)
		    System.out.println("Result is "+a/b);
		else
			System.out.println("Cant Divide");
	}
}
