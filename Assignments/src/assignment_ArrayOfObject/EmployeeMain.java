package assignment_ArrayOfObject;

import java.util.Scanner;

class Employee
{
	private int empNo;
	private String empName;
	Department dept;
	
	public Employee(int empNo, String empName, Department dept)
	{
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
	}
	
	public String toString()
	{
		return " Employee No is : "+ empNo + "," + " Employee name is : "+ empName + "," + dept;
	}
}

class Department
{
	private int deptId;
	private String deptName;

	public Department(int deptId, String deptName)
	{
		this.deptId = deptId;
		this.deptName = deptName;
	}
	
	public String toString()
	{
		return " Department Id is : "+ deptId + "," + " Department name is : "+ deptName;
	}
}

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee e[] = new Employee[3];
		
		for(int i = 0; i < e.length; i++)
		{
			System.out.println("Enter department Id : ");
			int id =  sc.nextInt();
			
			System.out.println("Enter department name : ");
			String dName =  sc.next();			
			
			System.out.println("Enter employee No. : ");
			int e_no =  sc.nextInt();
			
			System.out.println("Enter employee name : ");
			String e_name =  sc.next();	
			
			Department d = new Department(id,dName);
			
			e[i] = new Employee(e_no, e_name, d);
		}
		
		for(Employee emp : e)
		{
			System.out.println(emp);
		}
		
	}

}
