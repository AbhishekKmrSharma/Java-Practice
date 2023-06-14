import java.util.Scanner;
public class BankAccount 
{
	Scanner A=new Scanner(System.in);
	int accountNumber=1001;
	int totalBalance=100000;
	int depositAmmount=20000;
	int withdraw=50000;
	int getBalance=totalBalance+depositAmmount-withdraw;
	
	BankAccount()
	{
		System.out.print("Account Number = "+accountNumber);
		System.out.print("\nTotal Balance = "+totalBalance);		
	}
	void deposit()
	{
		System.out.print("\nDeposited Ammount = "+depositAmmount);
	}
	void withDraw()
	{
		System.out.print("\nWithdrawal = "+withdraw);
	    
	}
	void getBalance()
	{
		System.out.print("\nTotal Balance before fees deduction or interest is = "+getBalance);
	}
}
class CheckingAccount extends BankAccount
{
	int fee=10000;
	
	void deductFee()
	{
	   getBalance-=fee;
	   System.out.print("\nAfter Deduction of fee Balance is = "+getBalance);
	}
}

class calling
{
	public static void main(String[] args) {
		CheckingAccount obj=new CheckingAccount();
		obj.deposit();
		obj.withDraw();
		obj.getBalance();
		obj.deductFee();
	}
}