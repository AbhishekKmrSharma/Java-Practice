package string;

public class ReverseWithoutMinus 
{
	public static void main(String[] args)
	{
		String s1 = "a-bc-def-ghij"; //
		char[] c = s1.toCharArray();
		int l = 0;
		int r = s1.length() - 1;
		
		while(l < r)
		{
			if(c[l] == '-')
			{
				l++;
			}
			else if(c[r] == '-')
			{
				r--;
			}
			else
			{
				char temp = c[r];
				c[r] = c[l];
				c[l] = temp;
				l++;
				r--;
			}
		}
		String original = new String(c);
		System.out.println(original);
	}
}
