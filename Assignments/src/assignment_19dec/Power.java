package assignment_19dec;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base");
		int base = sc.nextInt();
		
		System.out.println("Enter the index");
		int index = sc.nextInt();
		
		int mult = 1;
		
		for(int i = 1; i <= index; i++)
		{
			mult = mult * base;
		}
		System.out.println(mult);
		
		sc.close();

	}

}
