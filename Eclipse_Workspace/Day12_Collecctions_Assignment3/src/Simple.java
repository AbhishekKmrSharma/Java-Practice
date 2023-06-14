import java.util.*;

public class Simple 
{
	public static void main(String[] args) {
		
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	Iterator i=al.iterator();
	while(i.hasNext())
	{
		System.out.print(i.next()+" ");
	}
	System.out.print("\n");
	
	
	System.out.println(al.size());
	Iterator j=al.iterator();
	while(j.hasNext())
	{
		System.out.print(j.next()+" ");
	}
	al.clear();
	Iterator k=al.iterator();
	while(k.hasNext())
	{
		System.out.print(k.next()+" ");
	}
	System.out.print("Rest code");
			
}
}
