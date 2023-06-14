import java.util.*;

public class MapBasics 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap();
		m.put(0, "Abhishek1");
		m.put(1, "Abhishek2");
		m.put(2,"Abhishek3");
		System.out.println(m);
		m.remove(2);
		Set<Integer> A=m.keySet();
		for(Integer a:A)
		{
			System.out.println(a+" "+m.get(a));
		}
		
		Map<String,Integer> map=new HashMap<>();
		map.put("a",2);
		Set<String> B=map.keySet();
		for(String b:B)
		{
			System.out.println(b+" "+map.get(b));
		}
	}
	
	
}
