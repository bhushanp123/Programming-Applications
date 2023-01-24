package basic;

import java.util.Scanner;

public class FibonachiSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("Enter the no of elements you want");
		int no = sc.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		
		int sum = 0;
		
		for(int i = 1; i <= no; i++)
		{
			sum = num1 + num2;
			
			System.out.println(sum);
			
			num1 = num2;
			num2 = sum;
		}

	}

}
