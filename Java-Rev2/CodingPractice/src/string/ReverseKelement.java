package string;

public class ReverseKelement
{
	public static void main(String[] args) 
	{
		String s = "abcdefgh";
		int k = 2;
		int len = s.length();
		char[] c = s.toCharArray();
		
		for(int i = 0; i < len; i = i + k )
		{
			int l = i, r = i + k;
			while(l < r)
			{
				char temp = c[l];
				c[l] = c[r];
				c[r] = temp;
				l++;
				r--;
			}
		}
		String originalS = new String(c);
		System.out.println(originalS);
	}
}
