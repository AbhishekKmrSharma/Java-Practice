import java.util.Scanner;
public class ElectricityBill {
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter Units consumed by customer = ");
		float units=A.nextFloat();
		double bill=0;
		if(units<=100)
		{
			bill+=units*1.20;
		}
		else if(units<=300)
		{
			bill=100*1.20+(units-100)*2.00;
		}
		else if(units<=600)
		{
			bill=100*1.20+200*2.00+(units-300)*3.00;
		}
		else if(units>600)
		{
			bill=100*1.20+200*2.00+300*3.00+(units-600)*5.00;
		}
		System.out.print("Have to pay the bill Rs-"+bill);
	}
}
