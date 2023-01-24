package assignment_19dec;

// 145 = 1! + 4! + 5! = 145

import java.util.Scanner;

public class Krishnamurti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0;
		int rem = 0;
		
		while(num != 0)
		{
			rem = num % 10;
			
			int mult = 1;
			
			for(int j = 1; j <= rem; j++)
			{
				mult = mult * j; 

			}
			sum = sum + mult;
			
			num = num / 10;
		}
		
		if(sum == temp)
		{
			System.out.println("Number is Krishnamurti");
		}
		else
		{		
			System.out.println("Number is not Krishnamurti");		
		}
		
		sc.close();

	}

}
