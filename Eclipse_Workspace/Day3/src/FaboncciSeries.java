import java.util.Scanner;
public class FaboncciSeries {
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter the number of elemets in series = ");
		int n=A.nextInt();
		int n1=0,n2=1,n3=0;
		System.out.print(n1+" "+n2+" ");
	    for(int i=2;i<=n;i++)
	    {
	    	n3=n1+n2;
	    	System.out.print(n3+" ");
	    	n1=n2;
	    	n2=n3;
	    }
	}
}
