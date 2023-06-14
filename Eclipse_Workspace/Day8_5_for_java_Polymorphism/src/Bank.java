
public class Bank 
{
	int investment=100000;
	float IR=10/100f;
	
	void FD()
	{
		float interest=(investment*IR)+investment;
		System.out.println("RBI Investment gives total money in year = "+interest);
	}
}
class SBI extends Bank
{
	float IR=5/100f;
	void FD()
	{
		super.FD();
		float interest=(investment*IR)+investment;
		System.out.println("SBI Investment gives total money in year = "+interest);
	}
}
class ICICI extends Bank
{
	float IR=6/100f;
	
	void FD()
	{
		float interest=(investment*IR)+investment;
		System.out.println("ICICI Investment gives total money in year = "+interest);
	}
}
class AXIS extends Bank
{
	float IR=7/100f;
	
	void FD()
	{
		float interest=(investment*IR+investment);
		System.out.println("AXIS Investment gives total money in year = "+interest);
	}
}
class FDcalculate
{
	public static void main(String[] args)
	{
		Bank c;
		c=new SBI();
		c.FD();
	}
}
	
	
	
