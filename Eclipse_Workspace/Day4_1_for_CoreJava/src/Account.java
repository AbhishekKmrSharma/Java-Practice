import java.util.Scanner;
public class Account 
{   
	int accno;
    String accname;
    float amount;
    float withdrawalAmount;
    void deposit()
    {
    	Scanner A=new Scanner(System.in);
    	System.out.print("Enter Account Number = ");
    	accno=A.nextInt();
    	System.out.print("Enter Account Holder Name = ");
    	accname=A.next();
    	System.out.print("Enter Total Deposited Amount = ");
    	amount=A.nextFloat();
    }
    void withdraw()
    {
    	Scanner A=new Scanner(System.in);
    	System.out.print("Enter Withdrawal Amount = ");
    	withdrawalAmount=A.nextFloat();    	
    }
    void interest()
    {
    	Scanner A=new Scanner(System.in);
    	float interest;
    	System.out.print("Interest = ");
    	interest=A.nextFloat();
    	float finalAmount=amount-withdrawalAmount;
    	finalAmount=finalAmount*(interest/100)+finalAmount;
    	System.out.print("Final Amount after interest is = "+finalAmount);
    }
}
class AccountDetails
{
	public static void main(String[] args)
	{
		Account obj1=new Account();
		obj1.deposit();
		obj1.withdraw();
		obj1.interest();
		System.out.print("\n\n");
		Account obj2=new Account();
		obj2.deposit();
		obj2.withdraw();
		obj2.interest();
	}
}
