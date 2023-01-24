// s = 1! + 2! + ....+n! = ?

package assignment_19dec;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int sum = 0;
		
		for(int i = 1; i <= num; i++)
		{
			int mult = 1;
			
			for(int j = 1; j <= i; j++)
			{
				mult = mult * j; 
			}
			sum = sum + mult;
		}
		System.out.println(sum);
		
		sc.close();

	}

}
