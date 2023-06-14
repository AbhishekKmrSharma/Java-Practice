public class DnamicArray 
{
	static int top=0;
	static int size=2;
	static int a[]=new int[size];
	
	static void push(int data)
	{
		
		if(top==size)
		{
			expand();
		}		
		a[top]=data;
		top++;
	}
	
     static void expand() 
     {
    	 int l=size();
    	 int a1[]=new int[size*2];
    	 for(int i=0;i<l;i++)
    	 {
    		 a1[i]=a[i];
    	 }
    	 a=a1;
    	 size=size*2;
     }

	static void show()
	{
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n");
	}
	
	static void pop(int a[])
	{
		a[top]=0;
		System.out.print("Last Element Removed \n");
		top--;
	}
	
	static int size()
	{
		return top;
	}
	
	public static void main(String[] args) 
	{	
		System.out.println("Size of Stack is = "+(top));
		show();
		push(10);
		push(20);
		System.out.println("Size of Stack is = "+(top));
		push(30);
		show();
		push(40);
		show();
		push(60);
		show();
		push(60);
		show();
		push(60);
		show();
		push(60);
		show();
		push(60);
		show();
	}
}


