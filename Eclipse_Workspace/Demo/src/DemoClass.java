import java.util.*;

public class DemoClass 
{
	public static void main(String[] args)
	{
		List<Integer> l=new ArrayList<>();
		List<String> ll=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		
		ll.add("10");
		ll.add("20");
		ll.add("30");
		ll.add("40");
		ll.add("50");
		
		int sum=0;
		
		for(int a:l)
		{
			sum+=a;
		}

		for(String s:ll)
		{
			sum=sum+Integer.parseInt(s);
		}
		
		System.out.println("Sum = "+sum);
	}
}
