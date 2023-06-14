package collection.set;
import java.util.*;

public class Sett 
{
	public static void main(String[] args) 
	{
		Set s=new HashSet();
		
		s.add("Abhishek");
		s.add(10);
		s.add(10);
		s.add("");
		s.add("");
		
		System.out.println(s);
	}
}
