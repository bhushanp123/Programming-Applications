package basic;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		float PI = 3.14f;
		
		System.out.println("Enter the radius of circle");
		float radius = sobj.nextFloat();
		
		float diameter = 2 * radius;
		System.out.println("Diameter is : "+diameter);
		
		float area = PI * radius * radius;
		System.out.println("Area is : "+area);
		
		float circumferance = 2 * PI * radius;
		System.out.println("Circumferance is : "+circumferance);
	}

}
