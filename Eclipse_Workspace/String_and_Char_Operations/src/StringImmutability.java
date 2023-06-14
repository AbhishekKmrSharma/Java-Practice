public class StringImmutability 
{
	public static void main(String[] args) 
	{
		String s1=new String("Abhi");
		String s2=new String("abhi");
		String s3="Abhi";
		String s4="Abhi";
		String s5="   ";
		
		if(s3.compareTo(s4)!=0)
		{
			System.out.println("Working");
		}
		else
		{
			System.out.println("not");
		}
		System.out.println(s5.trim().length());
		System.out.println(s3.compareTo(s4));
	}
}
