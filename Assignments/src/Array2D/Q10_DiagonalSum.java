package Array2D;

import java.util.Scanner;

public class Q10_DiagonalSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][3];
		
		System.out.println("Enter the elements");
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}

		}
		
		System.out.println("Array elements are : ");
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				if(i == j)
				{
					sum = sum + arr[i][j];
				}
				
			}
		}
		System.out.println("Sum of diagonal elements is : "+sum);

	}

}
