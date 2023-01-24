package basic;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the length of rectangle");
		float length = sobj.nextFloat();
		
		System.out.println("Enter the breadth of rectangle");
		float breadth = sobj.nextFloat();
		
		float perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of rectangle is : "+perimeter);
	}

}
