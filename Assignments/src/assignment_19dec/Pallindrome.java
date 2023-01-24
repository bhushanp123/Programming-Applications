package assignment_19dec;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0,cnt = 0;
		int rem = 0;
		
		while(num != 0)
		{
			rem = num % 10;
			cnt++;
			num = num / 10;
		}
		
		num = temp;
		
		while(num != 0)
		{
			int mult = 1;
			
			rem = num % 10;
			
			for(int i = 1; i <= cnt; i++)
			{
				mult = mult * rem;
			}
			sum = sum + mult;
			
			num = num / 10;
		}
		System.out.println(sum);
		
		if(sum == temp)
		{
			System.out.println("Number is Pallindrome");
		}
		else
		{		
			System.out.println("Number is not Pallindrome");		
		}
	}

}
