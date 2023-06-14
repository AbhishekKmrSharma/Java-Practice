import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter Principle = ");
		int P=A.nextInt();
		System.out.print("Enter Rate = ");
		int R=A.nextInt();
		System.out.print("Enter Time = ");
		int T=A.nextInt();
		int SI=P*R*T/100;
		System.out.println("Simple Interest will be = "+SI);
	}

}
