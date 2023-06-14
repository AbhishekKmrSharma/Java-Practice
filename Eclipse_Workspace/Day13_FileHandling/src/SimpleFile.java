import java.io.*;
import java.io.IOException;
public class SimpleFile 
{
	public static void main(String[] args) throws IOException {
		File obj=new File("E:\\First.txt");
		obj.createNewFile();
		FileWriter obj1=new FileWriter("E://First.txt");
		obj1.write("Continue Hard Work Abhishek");
		System.out.println(obj.getAbsolutePath());
		System.out.println(obj.length());
		System.out.println(obj.getName());
		obj1.close();
		System.out.println("File Edited");
	}
}
