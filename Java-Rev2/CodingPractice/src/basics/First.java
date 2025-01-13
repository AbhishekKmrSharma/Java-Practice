package basics;

import java.util.ArrayList;

public class First 
{
	int n;
	static
	{
		System.out.println("Hello");
	}
	
	{
		System.out.println("Hello Non "+(++n));
	}
	
	public static void main(String[] args)
	{
		String s1 = "200";
		int n =10;
		System.out.println(s1);
		int s = Integer.parseInt(s1);
		s1 = Integer.toString(n);
		System.out.println(s1);
		
		ArrayList al = new ArrayList<>(1);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		System.out.println(al);
		
		
	}
}
