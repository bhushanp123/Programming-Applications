package assignment_19dec;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int cnt = 0;
		int remainder = 0;
		
		while(num > 0)
		{
			remainder = num % 10;
			cnt++;
			num = num / 10;
		}
		System.out.println("Number of digits are : " + cnt);
		
		sc.close();
	}

}
