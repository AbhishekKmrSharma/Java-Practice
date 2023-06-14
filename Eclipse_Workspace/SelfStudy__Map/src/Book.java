import java.util.*;
public class Book 
{
	Scanner A=new Scanner(System.in);
	String name; 
	int price; 
	String authorName; 
	int isbnNo; 
	String publication;
	
	Book()
	{
		System.out.print("Enter the Book Name = ");
		name=A.nextLine();
		System.out.print("Enter the Book Price = ");
		price=A.nextInt();
		System.out.print("Author Name = ");
		authorName=A.next();
		System.out.print("Enter the ISBN no = ");
		isbnNo=A.nextInt();
		System.out.print("Enter the Publication Name = ");
		publication=A.next();
		System.out.print("\n\n");
	}
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", authorName=" + authorName + ", isbnNo=" + isbnNo
				+ ", publication=" + publication + "]";
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Scanner A=new Scanner(System.in);
		Book b1=new Book();
		Book b2=new Book();
		Book b3=new Book();
		Book b4=new Book();
		Book b5=new Book();
		
		Map<Integer,Book> m=new HashMap<>();
		m.put(101,b1);
		m.put(102,b2);
		m.put(103, b3);
		m.put(104, b4);
		m.put(105, b5);
		
		 for(Map.Entry m1:m.entrySet())
		 {  
			   System.out.println(m1.getKey()+" "+m1.getValue()); 
		 }
		 
		 System.out.println("Enter the Key which information you want to see = ");
		 int key=A.nextInt();
		 System.out.println(m.get(key)+"\n\n");
		 
		 if(b1.publication.equals("Laxmi"))
		 {
			 b1.price=b1.price*90/100;
			 System.out.println(m.get(101));
		 }
		 if(b2.publication.equals("Laxmi"))
		 {
			 b2.price=b2.price*90/100;
			 System.out.println(m.get(102));
		 }
		 if(b3.publication.equals("Laxmi"))
		 {
			 b3.price=b3.price*90/100;
			 System.out.println(m.get(103));
		 }
		 if(b4.publication.equals("Laxmi"))
		 {
			 b4.price=b4.price*90/100;
			 System.out.println(m.get(104));
		 }
		 if(b5.publication.equals("Laxmi"))
		 {
			 b5.price=b5.price*90/100;
			 System.out.println(m.get(105));
		 }
	}
}
