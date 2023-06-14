import java.util.Scanner;
public class Table {
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter the Number to Print the Table = ");
		int T=A.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(T+" x "+i+" = "+T*i);
			i++;
		}
	}

}
