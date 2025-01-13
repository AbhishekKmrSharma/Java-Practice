package basics;

public class ArraysOfObjects 
{
	String name;
	int a;
	
	{
		System.out.println("Static block");
	}
	
	public ArraysOfObjects(String name, int a)
	{
		this.name = name;
		this.a = a;
	}
	
	public static void main(String[] args)
	{
		ArraysOfObjects[] obj = new ArraysOfObjects[3];
		
		for(int i = 0; i < obj.length; i++)
		{
			obj[i] = new ArraysOfObjects("Abhishek", i);
		}
		for(ArraysOfObjects a:obj)
		{
			System.out.println(a.name+" "+a.a);
		}
	}
}

