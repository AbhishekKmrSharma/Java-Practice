import java.io.*;
public class AsscendString {
	public static void main(String[] args) throws IOException
	{
	    BufferedReader A=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of String Array = ");
		int size = Integer.parseInt(A.readLine());
		String str[]=new String[size];
		System.out.print("Enter "+size+" names: \n");
		for(int i=0;i<size;i++)
		{
			str[i]=A.readLine();
		}
		System.out.print("Unsorted string array = { ");
		for(int i=0;i<size;i++)
		{
			System.out.print(str[i]+", ");
		}
		System.out.print("}\n");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(str[j].compareTo(str[j+1])>0)
				{
				 String temp=str[j];
				 str[j]=str[j+1];
				 str[j+1]=temp;
				}
			}
		}
		System.out.print("Sorted array in ascending order = { ");
		for(int i=0;i<size;i++)
		{
			System.out.print(str[i]+", ");
		}
		System.out.print("}");
	}
	

}
