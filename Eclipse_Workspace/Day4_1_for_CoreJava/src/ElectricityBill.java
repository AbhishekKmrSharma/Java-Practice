import java.util.Scanner;
public class ElectricityBill 
{
      int customerNumber;
      String customerName;
      int unitsConsumed;
      void readData()
      {
    	  Scanner A=new Scanner(System.in);
    	  System.out.print("Enter the Customer Number = ");
    	  customerNumber=A.nextInt();
    	  System.out.print("Enter Customer Name = ");
    	  customerName=A.next();
    	  System.out.print("Enter the Units Consumed = ");
    	  unitsConsumed=A.nextInt();   	  
      }
      void showData()
      {
    	  System.out.println("Customer Details is as Follows: ");
    	  System.out.print("Number = "+customerNumber+"\nCustomer Name = "+customerName+"\nUnits Consumed = "+unitsConsumed+"\n");
      }
      void computeBill()
      {
    	  double bill=0;
    	if(unitsConsumed<=100)
    	{
    		bill=unitsConsumed*1.20;
    	}
    	else if(unitsConsumed<=300)
    	{
    		bill=100*1.20+(unitsConsumed-100)*2.00;
    	}
    	else if(unitsConsumed<=600)
    	{
    		bill=100*1.20+200*2.00+(unitsConsumed-300)*3.00;
    	}
    	else if(unitsConsumed>=600)
    	{
    		bill=100*1.20+200*2.00+300*3.00+(unitsConsumed-600)*5.00;
    	}
    	System.out.println("Total Electricity Bill = "+bill);

      }
}
class Result 
{
		  public static void main(String[] args)
		  {
			  ElectricityBill obj1=new ElectricityBill();
			  obj1.readData();
			  obj1.showData();
			  obj1.computeBill();
			  System.out.print("\n");
			  ElectricityBill obj2=new ElectricityBill();
			  obj2.readData();
			  obj2.showData();
			  obj2.computeBill();
		  
	      }

}