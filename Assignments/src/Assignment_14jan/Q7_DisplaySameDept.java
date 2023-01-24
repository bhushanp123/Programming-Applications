package Assignment_14jan;

import java.util.Scanner;

class Dept1
{
	private int dId;
	private String dName;
	
	public Dept1(int dId, String dName) 
	{
		this.dId = dId;
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Dept [dId=" + dId + ", dName=" + dName + "]";
	}
	
	public String getDName()
	{
		return dName;
	}
}

class MyDate1
{
	private int day;
	private int month;
	private int year;
	
	public MyDate1(int day, int month, int year) 
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

class Employee1
{
	private int emp_id;
	private String emp_name;
	private int salary;
	MyDate1 d;
	Dept1 de;
	
	public Employee1(int emp_id, String emp_name, int salary, MyDate1 d, Dept1 de) 
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
	
	public MyDate1 getD()
	{
		return d;
	}
	public Dept1 getDe()
	{
		return de;
	}
	public String getEmpName()
	{
		return emp_name;
	}
}

public class Q7_DisplaySameDept {

	public static void main(String[] args) {
Scanner sc  = new Scanner(System.in);
		
		Employee1 e[] = new Employee1[5];

		
		for(int i = 0; i < e.length; i++)
		{
			System.out.println("Enter dept Id");
			int d_Id = sc.nextInt();
			
			System.out.println("Enter dept name");
			String d_name = sc.next();
			
			Dept1 d = new Dept1(d_Id, d_name);
			
			System.out.println("Enter day");
			int day = sc.nextInt();
			
			System.out.println("Enter month");
			int month = sc.nextInt();
			
			System.out.println("Enter year");
			int year = sc.nextInt();
			
			MyDate1 m = new MyDate1(day, month, year);
			
			System.out.println("Enter employee Id");
			int e_Id = sc.nextInt();
			
			System.out.println("Enter employee name");
			String e_name = sc.next();
			
			System.out.println("Enter employee salary");
			int e_salary = sc.nextInt();
			
			e[i] = new Employee1(e_Id, e_name, e_salary, m, d);
		}
		
		for(int j = 0; j < e.length; j++)
		{
			for(int k = j+1; k < e.length; k++)
			{
				if(e[j].getDe().getDName().equals(e[k].getDe().getDName()))
				{
					System.out.println(e[j].getEmpName());
				}
					
			}
			
		}

	}

}
