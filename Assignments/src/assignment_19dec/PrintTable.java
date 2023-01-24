package assignment_19dec;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int mult = 1;
		
		for(int i = 1; i <= 10; i++)
		{
			mult = num * i;
			System.out.println(mult);
		}
		
		sc.close();
	}

}
