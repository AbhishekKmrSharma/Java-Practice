public class TotalChar_Strings {
	public static void main(String[] args)
	{
		String str="Welcome to CDAC";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.print("The total number of Characters in given string is = "+count);
	}

}
