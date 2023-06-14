import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollectionClass 
{
	public static void main(String[] args) 
	{
		Collection cn=new ArrayList();
		
		cn.add(1);
		cn.add("Abhishek");
		cn.clear();
		System.out.println(cn);
	}
}
