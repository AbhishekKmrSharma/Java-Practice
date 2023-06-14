import java.util.Scanner;
public class SimpleLL 
{
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	Node head;
	
	void AB(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			return;
		}
			n.next=head;
			head=n;
	}
	
	void AE(int data)
	{
		Node n=new Node(data);
		if(head==null)
		{
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n;
	}
	
	void AMA(int ele,int data)
	{
		Node n=new Node(data);
		Node temp=head;
		
		while(temp.data!=ele)
		{
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
	}
	
	void AMB(int ele,int data)
	{
		Node n=new Node(data);
		
		Node temp=head;
		
		Node prevTemp=null;
		
		while(temp.data!=ele)
		{
			prevTemp=temp;
			temp=temp.next;
		}
		
		n.next=temp;
		prevTemp.next=n;
	}
	
	void DN(int ele)
	{
		Node temp=head;
		Node prevTemp=null;
		
		while(temp.data!=ele)
		{
			prevTemp=temp;
			temp=temp.next;
		}
		if(prevTemp==null)
		{
			prevTemp=temp;
			temp=prevTemp.next;
			prevTemp.next=null;
			head=temp;
		}
		else
		{
			prevTemp.next=temp.next;
			temp=null;
		}
	}
	
	void DNA(int ele)
	{
		Node temp=head;
		Node prevTemp=null;
		
		
		while(temp.data!=ele)
		{
			prevTemp=temp=temp.next;
		}
		if(temp.next==null)
		{
			System.out.println("no ele");
		}
		else
		{
		if(prevTemp==null)
		{
			prevTemp=temp;
			temp=prevTemp.next;
			prevTemp.next=temp.next;
			temp=null;
		}}}
	
	void PR()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}		
public static void main(String[] args) 
	{
		SimpleLL l=new SimpleLL();
		Scanner A=new Scanner(System.in);
		boolean a=true;
		
		while(a)
		{
			System.out.println("Enter string");
			String s=A.next();
			switch(s)
			{
			case "AB":
			{
				int data=A.nextInt();
				l.AB(data);
				break;
			}
			case "PR":
			{
				l.PR();
				break;
			}
			case "AE":
			{
				System.out.println("Enter Number");
				int data=A.nextInt();
				l.AE(data);
				break;
			}
			case "AMA":
			{
				System.out.println("Enter Number");
				int ele=A.nextInt();
				System.out.println("Enter Number");
				int data=A.nextInt();
				l.AMA(ele,data);
				break;
			}
			case "AMB":
			{
				System.out.println("Enter Number");
				int ele=A.nextInt();
				System.out.println("Enter Number");
				int data=A.nextInt();
				l.AMB(ele,data);
				break;
			}
			case "DN":
			{
				System.out.println("Enter Number");
				int ele=A.nextInt();
				l.DN(ele);
				break;
			}
			case "DNA":
			{
				System.out.println("Enter Number");
				int ele=A.nextInt();
				l.DNA(ele);
				break;
			}
			case "EXIT":
			{
				System.exit(1);
			}
			}
		}
	}}
