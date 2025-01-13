package MultiThreading;

public class StaticSynchro extends Thread
	{
		static BookingAppData1 b;
		int seats;
		
		public StaticSynchro(BookingAppData1 b) 
		{
			this.b = b;
		}

		public void run()
		{
			b.ticketBook(seats);
		}
		
		public static void main(String[] args)
		{
			BookingAppData1 b1 = new BookingAppData1();
			BookingAppData1 b2 = new BookingAppData1();
			
			StaticSynchro t1 = new StaticSynchro(b1);
			t1.seats = 7;
			t1.start();
			
			StaticSynchro t2 = new StaticSynchro(b1);
			t2.seats = 6;
			t2.start();
			
			StaticSynchro t3 = new StaticSynchro(b2);
			t3.seats = 5;
			t3.start();
			
			StaticSynchro t4 = new StaticSynchro(b2);
			t4.seats = 10;
			t4.start();
		}
	}

class BookingAppData1 
	{
		int total_seats = 20;
		
		//synchronized void ticketBook(int seats)
		synchronized void ticketBook(int seats)
		{
//			System.out.println(Thread.currentThread().getName());
//			System.out.println(Thread.currentThread().getName());
			
//			synchronized(this)// we are using this if we are sunchronized block otherwise we are keeping the cofde normal;ly only
//			{
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
			//}
//			System.out.println(Thread.currentThread().getName());
//			System.out.println(Thread.currentThread().getName());
		}
}
