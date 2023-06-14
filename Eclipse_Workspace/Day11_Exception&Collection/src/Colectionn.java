import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Colectionn 
{
	static Scanner A=new Scanner(System.in);
	static void add(ArrayList al)
	{
		System.out.println("Enter number of elements you want to enter = ");
		int num=A.nextInt();
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter Element to Enter = ");
			int num1=A.nextInt();
			al.add(num1);
		}
	}
	static void display(ArrayList al)
	{
		Iterator i=al.iterator();
		System.out.println("Elements in Array are = ");
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
		System.out.println("\n \n");
	}
	static void remove(ArrayList al)
	{
		System.out.println("Enter the Index Nmber you want to Delete = ");
		int num=A.nextInt();
		al.remove(num);
		System.out.println("Removed");
	}
}

class Run
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		int choice = 0;
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		while(choice!=10)
		{
		System.out.print("1 for Add Element\n2 for Display Element\n3 for Exit\n4 For Removing Element");
		choice=A.nextInt();
		switch(choice)
		{
		case 1:
		{
			Colectionn.add(al);
			break;
		}
		case 2:
		{
			Colectionn.display(al);
			break;
		}
		case 3:
		{
			System.out.println("Exiting");
			System.exit(0);
		}
		case 4:
		{
			Colectionn.remove(al);
			break;
		}
		default:
		{
			System.out.println("Invalid Choice");
			break;
		}
			
		}
		
		}
	}
}