import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BasicFirst 
{
	public static void main(String[] args) 
	{
		Collection c=new ArrayList();
		c.add(10);
		c.add("c");
		c.add("Abhishek");
		
		System.out.println(c);
		
		Iterator it=c.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
