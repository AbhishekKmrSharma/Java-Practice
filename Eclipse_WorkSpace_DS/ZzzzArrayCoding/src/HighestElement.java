import java.util.*;

public class HighestElement 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(5);
		al.add(3);
		al.add(1);
		
		Integer max=al.get(0);
		Integer min=al.get(0);
		
		Integer smax=0;
		Integer smin=0;
		
		for(Integer a:al)
		{
			if(a>max)
			{
				smax=max;
				max=a;
			}
			else if(a<min)
			{
				smin=min;
				min=a;
			}
		}
		
		System.out.println(max+" "+min);
		System.out.println(smax+" "+smin);		
	}
}
