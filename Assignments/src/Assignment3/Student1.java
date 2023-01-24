package Assignment3;

import java.util.Scanner;

public class Student1 {
	int id = 5;
	String name = "Bhushan";
	
	void displayData()
	{
		int no = getid();
		System.out.println(no);
		//System.out.println(name);
	}
	
	int getid()
	{
		return id;
	}
	
	void display()
	{
		id = 15;
		name = "Ram";
		
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		
		s1.displayData();
		
		s1.display();
	}

}
