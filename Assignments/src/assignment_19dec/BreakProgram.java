package assignment_19dec;

import java.util.Scanner;

public class BreakProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int no = sc.nextInt();
		
		int flag = 0;
		
		for(int i = 2;i < no;i++)
		{
			if(no % i == 0)
			{
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is prime");
		}
		
		sc.close();

	}

}
