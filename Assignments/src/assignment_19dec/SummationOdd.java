package assignment_19dec;

import java.util.Scanner;

public class SummationOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 3; i < no; i++)
		{
			if(i % 2 != 0)
			{
				sum = sum + i;
			}
		}
		
		System.out.println("Addition is : "+ sum);
		
		sc.close();

	}

}
