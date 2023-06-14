import java.util.*;
public class ArrayList1 
{
	static Scanner A = new Scanner(System.in);
	static void add(ArrayList al)
	{
		System.out.print("\nEnter of Elemets you want to enter = ");
		int n=A.nextInt();
		System.out.print("\nEnter Element to Add = ");
		for(int i=0;i<n;i++)
		{
			int ele=A.nextInt();
			al.add(ele);
		}
	}
	static void display(ArrayList al)
	{
		Iterator a=al.iterator();
		System.out.print("\nElements in Arraylist are = ");
		while(a.hasNext())
		{
			System.out.print(a.next()+" ");
		}
		System.out.print("\n");
	}
	static void particularElement(ArrayList al)
	{
		try
		{
		System.out.print("Enter Index number where you want to check Element = ");
		int p=A.nextInt();
		System.out.println(al.get(p));
		}
		catch(Exception e)
		{
			System.out.println("Entered Index Number not present\n");
		}
	}
	static void removeElement(ArrayList al)
	{
		try {
		System.out.print("Enter Index number where you want to Remove Element = ");
		int p=A.nextInt();
		System.out.println(al.remove(new Integer(p))+"Removed");
		}
		catch(Exception e)
		{
			System.out.println("Entered Index Number not present\n");
		}
	}
	static void sort(ArrayList al)
	{
		Collections.sort(al);
		Iterator a=al.iterator();
		System.out.print("\nSorted Elements are = ");
		while(a.hasNext())
		{
			System.out.print(a.next()+" ");
		}
		System.out.print("\n");
	}
}

class Test12
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		ArrayList<Integer> al=new ArrayList<>();
		int choice = 0;
		while(choice!=10)
		{
			System.out.println("1 for Add elements in Arraylist\n2 for Remove a Particular Element\n3 for Modification\n4 for View All Elements\n5 for View Particular Element\n6 for Sort the ArrayList\n7 for Exit");
			choice=A.nextInt();
			switch(choice)
			{
			case 1:
			{
				ArrayList1.add(al);
				break;
			}
			case 2:
			{
				ArrayList1.removeElement(al);
				break;
			}
			case 4:
			{
				ArrayList1.display(al);
				break;
			}
			case 5:
			{
				ArrayList1.particularElement(al);
				break;
			}
			case 6:
			{
				ArrayList1.sort(al);
				break;
			}
			case 7:
			{
				System.out.println("Exited");
				System.exit(0);
			}
			default: 
			{
				System.out.println("Invalid Option");
				break;
			}
			}
		}
	}
}
