import java.util.*;


public class String1 
{
	
    public static void main(String[] args) 
	{
    	ArrayList<Integer> a=new ArrayList();
		a.add(15);
		a.add(10);
		a.add(8);
		a.add(25);
		a.remove(1);
		

//		a[0]=2.123f;
//		a[1]=13;
//		a[2]=-13f;
//		
////		for(int i=0;i<3;i++)
////		{
////			System.out.println(name[i]);
////		}
		
		for(Object i:a)
		{
			System.out.println(i);
		}
		
	}
}