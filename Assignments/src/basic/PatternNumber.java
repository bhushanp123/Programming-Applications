package basic;

import java.util.Scanner;

public class PatternNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter the no of cols");
		int cols = sc.nextInt();
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
