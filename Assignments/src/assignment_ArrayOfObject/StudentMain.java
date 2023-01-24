package assignment_ArrayOfObject;

import java.util.Scanner;

class Student
{
	private int id;
	private String name;
	private boolean isspecial;
	Course c;
	
	public Student(int id,String name,boolean isspecial,Course c)
	{
		this.id = id;
		this.name = name;
		this.isspecial = isspecial;
		this.c = c;
	}
	
	/*if(isspecial == true)
	{
		System.out.println("Student is special");
	}
	else
	{
		System.out.println("Student is not special");
	}
	
	public String toString()
	{
		return "Student id is : " + id + "," + "Student name is : "+ name + "," + c;
	}*/
	
	
	
}
class Course
{
	private String cname;
	private int fees;
	
	public Course(String cname,int fees)
	{
		this.cname = cname;
		this.fees = fees;
	}
	
	public String toString()
	{
		return "Course name is : " + cname + "," + "Course fees is : "+ fees;
	}
}

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s[] = new Student[3];
		
		for(int i = 0; i < s.length; i++)
		{
			System.out.println("Enter student Id : ");
			int id =  sc.nextInt();
			
			System.out.println("Enter student name : ");
			String sName =  sc.next();			
			
			System.out.println("Enter course Name : ");
			String cName =  sc.next();
			
			System.out.println("Enter course fees : ");
			int cFees =  sc.nextInt();	
			
			Course c = new Course(cName, cFees);
			
			if(cFees > 50000)
			{
				s[i] = new Student(id, sName, true , c);
			}
			else
			{
				s[i] = new Student(id, sName, false ,c);
			}
			
		}
		
		for(Student stud : s)
		{
			System.out.println(stud);
		}

	}

}
