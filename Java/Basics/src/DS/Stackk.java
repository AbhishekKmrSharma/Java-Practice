package DS;

public class Stackk
{
	int top = -1;
	
	public boolean isFull(int a[])
	{
		return top >= a.length -1;
	}
	
	public boolean isEmpty()
	{
		return top < 0;
	}
	
	public void push(int []a, int data)
	{
		if(isFull(a))
		{
			System.out.println("OverFlow, can't Insert");
			return;
		}
		top++;
		a[top] = data;
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("UnderFlow");
		}
		else
		{
			top--;
			System.out.println("Deleted");
		}
	}
	
	public void display(int a[])
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public void peek(int a[])
	{
		if(isEmpty())
		{
			System.out.println("UnderFlow");
		}
		else
		{
			System.out.println("Top Element :"+a[top]);
		}
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Stackk s = new Stackk();
		int a[] = new int[5];
		s.peek(a);
		s.pop();
		s.push(a,100);
		s.push(a,110);
		s.display(a);
		System.out.println();
		s.push(a,210);
		s.push(a,310);
		s.push(a,1);
		s.pop();
		s.pop();
		s.display(a);
	}
}
