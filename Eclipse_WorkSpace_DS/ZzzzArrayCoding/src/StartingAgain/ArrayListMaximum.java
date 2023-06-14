package StartingAgain;

import java.util.ArrayList;

public class ArrayListMaximum 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<>();
		
		a.add(10);
		a.add(20);
		a.add(5);
		a.add(9);
		a.add(50);
		a.add(0);
		
		int max=0;
		int sMax=0;
		
		int min=10000;
		int sMin=min+1;
		
		for(int b:a)
		{
			if(b>max)
			{
				sMax=max;
				max=b;
			}
			if(min>b)
			{
				sMin=min;
				min=b;
			}
		}
		System.out.println("Maximum value = "+max+"\n"+"Second max = "+sMax);
		System.out.println("Minimum = "+min+"\n"+"Second Min = "+sMin);
	}
}
