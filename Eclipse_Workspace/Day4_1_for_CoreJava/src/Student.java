import java.util.Scanner;
public class Student {
	int id;
	String name;
	float marks;
	void readData()
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter Student ID = ");
		id=A.nextInt();
		System.out.print("Enter Student Name = ");
		name=A.next();
		System.out.print("Enter Marks Obtained = ");
		marks=A.nextFloat();
	}
	void showData()
	{
		System.out.print("Student Detail is as follows with final result:\n");
		System.out.print("Student ID = "+id+"\nStudent Name = "+name+"\nMarks obtained = "+marks+"\n");
	}
	void result()
	{
		if(marks>=40)
		{
			System.out.print("Final Result = Pass\n");
		}
		else
		{
			System.out.print("Final Result = Fail\n");
		}
	}
}
class StudentResult
{
	public static void main(String[] args)
	{
		Student obj1=new Student();
		obj1.readData();
		obj1.showData();
		obj1.result();
		System.out.print("\n");
		Student obj2=new Student();
		obj2.readData();
		obj2.showData();
		obj2.result();
	}
}