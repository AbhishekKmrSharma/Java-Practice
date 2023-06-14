import java.lang.reflect.Array;
import java.util.Scanner;
public class CharArray {
	public static void main(String[] args)
	{
	Scanner A=new Scanner(System.in);
	System.out.print("Enter the character Array length = ");
	int size=A.nextInt();
	char ch[]=new char[size];
	System.out.print("Enter Characters in array = ");
	for(int i=0;i<size;i++)
	{
		ch[i]=A.next().charAt(0);
	}
	for(int i=0;i<size;i++)
	{
	System.out.print("\nch["+i+"] = "+ch[i]);
	}
}
}
