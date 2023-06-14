import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class LinkedL 
{
	public static void main(String[] args) 
	{
		List<Integer> la=new LinkedList<>();
		la.add(10);
		la.add(10);
		la.add(10);
		la.add(10);
		la.add(10);
		
		System.out.println(la);
		
		for(Integer a:la)
		{
			System.out.println(a);
		}
		
		Iterator it=la.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}	
}
