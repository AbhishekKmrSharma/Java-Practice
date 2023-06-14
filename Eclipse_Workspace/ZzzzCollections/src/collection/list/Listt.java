package collection.list;
import java.util.*;

public class Listt 
{
	public static void main(String[] args) 
	{
		List<Integer> l=new ArrayList();
		l.add(10);
		l.add(1,88888);
		System.out.println(l.size());
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		l.add(2,25);
		Collections.sort(l);
		for(Integer o:l)
		{
			System.out.println(o);
		}
	}
}
