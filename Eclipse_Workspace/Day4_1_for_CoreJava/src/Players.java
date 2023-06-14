import java.util.Scanner;
public class Players
{
	Scanner A=new Scanner(System.in);
	String name;
	int age;
	String countryName;
	int totalRun;
	
	void playerData()
	{
		System.out.print("Enter Player Name = ");
		name=A.next();
		System.out.print("Enter Player Age = ");
		age=A.nextInt();
		System.out.print("Enter Player Country Name = ");
		countryName=A.next();
		System.out.print("Enter Player Total Run = ");
		totalRun=A.nextInt();
	}
	void display()
	{
		System.out.print("\nPlayer Name = "+name+"\nPlayer Age = "+age+"\nCountry = "+countryName+"\nTotal Run = "+totalRun+"\n");
	}
}
class Data
{
	public static void main(String[] args)
	{
		Players obj1=new Players();
		obj1.playerData();
		System.out.print("\n");
		Players obj2=new Players();
		obj2.playerData();
		System.out.print("\n");
		Players obj3=new Players();
		obj3.playerData();
		System.out.print("\n");
		Players obj4=new Players();
		obj4.playerData();
		System.out.print("\n");
		Players obj5=new Players();
		obj5.playerData();
		System.out.print("\nPlayers Having more than 5000 runs: \n");
		if(obj1.totalRun>5000)
		{
			obj1.display();
		}
		if(obj2.totalRun>5000)
		{
			obj2.display();
		}
		if(obj3.totalRun>5000)
		{
			obj3.display();
		}
		if(obj4.totalRun>5000)
		{
			obj4.display();
		}
		if(obj5.totalRun>5000)
		{
			obj5.display();
		}
		
	}
}