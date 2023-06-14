import java.util.Scanner;
public class Emp 
{
	Scanner A=new Scanner(System.in);
	int empno;
	String empName;
	String design;
	static String dept="Software";
	int salary;
	
	Emp()
	{
		System.out.print("Enter Employee Number = ");
		empno=A.nextInt();
		System.out.print("Enter Employee Name = ");
		empName=A.next();
		System.out.print("Enter Employee Designation = ");
		design=A.next();
		System.out.print("Enter Salary = ");
		salary=A.nextInt();
	}
	void displayData()
	{
		System.out.print("\nEmployee Details as follows : \n");
		System.out.print("Employee Number = "+empno+"\nEmployee Name = "+empName+"\nDesignation = "+design+"\nDepartment = "+dept+"\nSalary = "+salary+"\n");
	}
}
class EmpData
{
	public static void main(String[] args)
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter Number of Employees Enteries you want = ");
		int size=A.nextInt();
		Emp[] obj=new Emp[size];
		for(int i=0;i<size;i++)
		{
			obj[i]=new Emp();
			obj[i].displayData();
			System.out.print("\n");
		}
	}
}
