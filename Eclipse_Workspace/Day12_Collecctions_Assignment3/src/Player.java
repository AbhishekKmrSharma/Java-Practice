import java.util.*;
import java.util.Scanner;
public class Player 
{
	Scanner s=new Scanner(System.in);
	String Player_name; 
	int total_run; 
	int no_of_wicket; 
	int no_of_matches; 
	String country; 
	int no_of_century; 
	String Category = null;
	
	void create()
	{
			System.out.println("Enter Player Details: \n");
			System.out.print("Enter Player Name = ");
			Player_name=s.next();
			System.out.print("Enter Total Runs = ");
			total_run=s.nextInt();
			System.out.print("Enter Total no.of Wickets = ");
			no_of_wicket=s.nextInt();
		    System.out.print("Number of Matches Played = ");
		    no_of_matches=s.nextInt();
		    System.out.print("Country = ");
		    country=s.next();
		    System.out.print("Enter total number of Century = ");
		    no_of_century=s.nextInt();
		    System.out.print("Category = "+Category+"\n\n");
	}
	
	void display()
	{
		System.out.println("Player Name = "+Player_name+"\nTotal Runs = "+total_run+"\nNumber of Wickets = "+no_of_wicket+"\nNumber of Matches Played = "+no_of_matches+"\nCountry = "+country+"\nNumber of Century = "+no_of_century+"\nCategory = "+Category);		
	}

	@Override
	public String toString() {
		return "Player [Player_name=" + Player_name + ", total_run=" + total_run + ", no_of_wicket=" + no_of_wicket
				+ ", no_of_matches=" + no_of_matches + ", country=" + country + ", no_of_century=" + no_of_century
				+ ", Category=" + Category + "]";
	}
	

	}
class Test
{
	public static void main(String[] args) 
	{
		Player obj1=new Player();
		obj1.create();
		Player obj2=new Player();
		obj2.create();
		Player obj3=new Player();
		obj3.create();
		Player obj4=new Player();
		obj4.create();
		Player obj5=new Player();
		obj5.create();
		
		List<Player> al=new ArrayList<>();
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		
		for(Player p:al)
		{
			System.out.println(p);
		}
		
		System.out.println("Player who scored Maximum Runs:  ");
		
		if(obj1.total_run>obj2.total_run&&obj1.total_run>obj3.total_run&&obj1.total_run>obj4.total_run&&obj1.total_run>obj5.total_run)
		{
			Player a=al.get(0);
			System.out.println(a);
		}
		if(obj2.total_run<obj2.total_run&&obj2.total_run>obj3.total_run&&obj2.total_run>obj4.total_run&&obj2.total_run>obj5.total_run)
		{
			Player a=al.get(1);
			System.out.println(a);
		}
		if(obj3.total_run>obj2.total_run&&obj1.total_run<obj3.total_run&&obj3.total_run>obj4.total_run&&obj3.total_run>obj5.total_run)
		{
			Player a=al.get(2);
			System.out.println(a);
		}
		if(obj4.total_run>obj2.total_run&&obj4.total_run>obj3.total_run&&obj4.total_run>obj1.total_run&&obj4.total_run>obj5.total_run)
		{
			Player a=al.get(3);
			System.out.println(a);
		}
		if(obj5.total_run>obj2.total_run&&obj5.total_run>obj3.total_run&&obj5.total_run>obj4.total_run&&obj5.total_run>obj1.total_run)
		{
			Player a=al.get(4);
			System.out.println(a);
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}