package assignment_19dec;

import java.util.Scanner;

public class ProductDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
	
		int remainder = 0;
		int mult = 1;
		
		while(num > 0)
		{
			remainder = num % 10;
			mult = mult * remainder;
			num = num / 10;
		}
		System.out.println("product of digits is : " + mult);
		
		sc.close();

	}

}
