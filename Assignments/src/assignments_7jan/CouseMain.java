package assignments_7jan;

import java.util.Scanner;

class Course
{
	int noOfCourses;
	
	public void courseInfo()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of courses");
		noOfCourses = sc.nextInt();
		
		String arr[] = new String[noOfCourses];
		
		System.out.println("Enter course names : ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.next();
		}
		
		System.out.println("Enter the course to be search");
		String search = sc.next();
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].equals(search))
			{
				System.out.println(search + " course is available");
			}
		}
	}


}

public class CouseMain {

	public static void main(String[] args) {
		Course c = new Course();
	
		c.courseInfo();
	}

}
