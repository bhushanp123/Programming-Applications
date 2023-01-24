package basic;

import java.util.Scanner;

public class PatternChar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter the no of cols");
		int cols = sc.nextInt();
		
		int i = 1;
		char ch = 'A';
		
		for(i = 1,ch = 'A'; i <= rows; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}

	}

}
