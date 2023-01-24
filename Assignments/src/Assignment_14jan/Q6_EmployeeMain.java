package Assignment_14jan;

import java.util.Scanner;

class Dept
{
	private int dId;
	private String dName;
	
	public Dept(int dId, String dName) 
	{
		this.dId = dId;
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Dept [dId=" + dId + ", dName=" + dName + "]";
	}
	
	
}

class MyDate
{
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}

class Employee
{
	private int emp_id;
	private String emp_name;
	private int salary;
	MyDate d;
	Dept de;
	
	public Employee(int emp_id, String emp_name, int salary, MyDate d, Dept de) 
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
		this.d = d;
		this.de = de;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + ", d=" + d + ", de="
				+ de + "]";
	}
	
	
}

public class Q6_EmployeeMain {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		Employee e[] = new Employee[10];

		
		for(int i = 0; i < e.length; i++)
		{
			System.out.println("Enter dept Id");
			int d_Id = sc.nextInt();
			
			System.out.println("Enter dept name");
			String d_name = sc.next();
			
			Dept d = new Dept(d_Id, d_name);
			
			System.out.println("Enter day");
			int day = sc.nextInt();
			
			System.out.println("Enter month");
			int month = sc.nextInt();
			
			System.out.println("Enter year");
			int year = sc.nextInt();
			
			MyDate m = new MyDate(day, month, year);
			
			System.out.println("Enter employee Id");
			int e_Id = sc.nextInt();
			
			System.out.println("Enter employee name");
			String e_name = sc.next();
			
			System.out.println("Enter employee salary");
			int e_salary = sc.nextInt();
			
			e[i] = new Employee(e_Id, e_name, e_salary, m, d);
		}
		
		for(Employee emp : e)
		{
			System.out.println(emp);
		}
	}
}
