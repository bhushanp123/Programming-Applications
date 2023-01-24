package Assignment31_Dec;

import java.util.Scanner;

public class PrintAreaMain {

	public static void main(String[] args) {
		PrintArea obj = new PrintArea();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side of square");
		int side = sc.nextInt();
		
		System.out.println("Enter the length of rectangle");
		int length = sc.nextInt();
		
		System.out.println("Enter the breadth of rectangle");
		int breadth = sc.nextInt();
		
		System.out.println("Square area is : "+obj.area(side));
		System.out.println("Rectangle area is : "+obj.area(length,breadth));
	}

}
