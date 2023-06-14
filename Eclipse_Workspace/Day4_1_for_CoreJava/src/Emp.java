import java.util.Scanner;
public class Emp 
{ 
	int empNo;
	String empName;
	String designation;
	String department;
	int salary;
	
	void readEmpData()
	{
		Scanner A=new Scanner(System.in);
		System.out.print("Enter the Employee Number = ");
		empNo=A.nextInt();
		System.out.print("Enter the Employee Name = ");
		empName=A.next();
		System.out.print("Designation = ");
		designation=A.next();
		System.out.print("Department = ");
		department=A.next();
		System.out.print("Salary = ");
		salary=A.nextInt();
	}
	void displayEmpData()
	{
		System.out.print("\nEmployee Details as Follows:");
		System.out.print("\nEmpoyee Number = "+empNo+" \nEmployee Name = "+empName+" \nDesignation = "+designation+"\nDepartment = "+department+"\nSalary = "+salary+"\n");
	}
}
class EmpData
{
	public static void main(String[] args)
	{
		Emp obj1=new Emp();
		obj1.readEmpData();
		obj1.displayEmpData();
		System.out.print("\n");
		Emp obj2=new Emp();
		obj2.readEmpData();
		obj2.displayEmpData();
	}
}

