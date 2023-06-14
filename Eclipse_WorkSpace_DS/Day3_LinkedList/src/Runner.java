public class Runner 
{
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		
		l.insert(10);
		l.insert(20);
		l.show();
//		for(int i=0;i<15;i++)
//		{
//			l.insert(i);
//		}
		System.out.println();
		l.insertB(70);
		l.show();
		System.out.println();
		l.insertAny(2, 25);
		l.show();
		System.out.println();
		l.insertAny(0, 55);
		l.show();
		l.delAny(3);
		System.out.println();
		l.show();
		
	}
}
