import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist2 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(50);
		a.add(40);
		a.add(30);
		a.add(20);
		a.add(100);
		a.remove(4);
		Collections.sort(a);
		System.out.println(a.size());
		
		Iterator b=a.iterator();
		while(b.hasNext())
		{
			System.out.print(b.next()+" ");
		}
		System.out.println();
		System.out.println(a.get(3));
	}
}
