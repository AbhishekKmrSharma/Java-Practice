public class Youtube 
{
	public static void main(String[] args) 
	{
		String s1=new String("Abhi");
		String s2=new String ("abhi");
		String s="";
		
		for(int i=s2.length()-1;i>=0;i--)
		{
			s=s+s2.charAt(i);
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}
}
