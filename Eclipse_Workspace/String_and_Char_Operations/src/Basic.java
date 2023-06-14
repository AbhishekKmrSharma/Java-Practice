import java.util.Scanner;
public class Basic 
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		
		char c[]= {'A','B','H','I'};
		String s[]= {"Abhi","Shek"};
		String s1=new String(c);
		System.out.println(s[0]+" "+s[1]);
		System.out.println(s1);
		s1=s1.concat("KUMAR");
		System.out.println(s1);
	}
}
