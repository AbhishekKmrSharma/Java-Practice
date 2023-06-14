package collection.set;
import java.util.*;

public class SortedSett
{
	public static void main(String[] args) 
	{
		SortedSet<Integer> s=new TreeSet();
		
		s.add(10);
		s.add(5);
		s.add(8);
		
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
