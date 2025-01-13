package string;

public class Pattern2 
{
	public static void main(String[] args) 
	{
		String s1 = "Hi hello world hello world world hello";
		String pattern  = "hello";
		String s2[] = s1.split(" ");
		int count = 0;
		
		for(int i = 0; i < s2.length; i++)
		{
			if(pattern.equals(s2[i]))
			{
				s2[i] = "";
				count++;
			}
		}
		
		String originalString = String.join(" ", s2);
		System.out.println(originalString+count);
	}
}
