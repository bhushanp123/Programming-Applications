package Assignment31_Dec;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("are you from NIT college?");
		String c_name = sc.nextLine();
		
		if(c_name.equals("yes") || c_name.equals("YES"))
		{
			System.out.println("Enter student name");
			String s_name = sc.nextLine();
			
			System.out.println("Enter student address");
			String s_address = sc.nextLine();
			
			System.out.println("Enter student Id");
			int id = sc.nextInt();
			
			Student s = new Student(id,s_name,s_address);
			
		}
		else if(c_name.equals("no") || c_name.equals("No"))
		{
			System.out.println("Enter student name");
			String s_name = sc.nextLine();
				
			System.out.println("Enter student address");
			String s_address = sc.nextLine();
			
			System.out.println("Enter college name");
			String college_name = sc.nextLine();
			
			System.out.println("Enter student Id");
			int id = sc.nextInt();
			
			Student s = new Student(id,s_name,s_address,college_name);
		}
		else
		{
			System.out.println("Wrong input");
		}
		
	}

}
