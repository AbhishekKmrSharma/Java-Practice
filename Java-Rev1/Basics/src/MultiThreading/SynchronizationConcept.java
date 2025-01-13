package MultiThreading;

public class SynchronizationConcept extends Thread
{
	static BookingAppData b;
	int seats;
	
	public void run()
	{
		b.ticketBook(seats);
	}
	
	public static void main(String[] args)
	{
		b = new BookingAppData();
		
		SynchronizationConcept t1 = new SynchronizationConcept();
		t1.seats = 7;
		t1.start();
		
		SynchronizationConcept t2 = new SynchronizationConcept();
		t2.seats = 6;
		t2.start();
	}
}

class BookingAppData 
{
	int total_seats = 10;
	
	//synchronized void ticketBook(int seats)
	void ticketBook(int seats)
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		
		synchronized(this)// we are using this if we are sunchronized block otherwise we are keeping the cofde normal;ly only
		{
			if(total_seats >= seats)
			{
				System.out.println(seats+" Seats Booked");
				total_seats = total_seats - seats;
				System.out.println("Seats Left : "+total_seats	);
			}
			else
			{
				System.out.println("Sorry This much seats not available : "+seats);
				System.out.println("Seats Available : "+total_seats);
			}
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
	}
}
