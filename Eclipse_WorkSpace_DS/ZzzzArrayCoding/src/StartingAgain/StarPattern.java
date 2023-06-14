package StartingAgain;

import java.util.ArrayList;
import java.util.Scanner;

public class StarPattern 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(1);
		al.add(111);
		al.add(121);
		al.add(101);
		al.add(251);
		
		int count=0;
		
		for(Integer a:al)
		{
			while(a>0)
			{
				int r=a%10;
				if(r==1)
				{
					count++;
				}
				a=a/10;
			}
		}
		
		System.out.println(count);
		
	}
}
