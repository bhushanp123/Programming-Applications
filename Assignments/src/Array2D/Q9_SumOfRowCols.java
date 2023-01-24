package Array2D;

import java.util.Scanner;

public class Q9_SumOfRowCols {

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
		
		
		
		for(int i = 0; i < arr.length; i++)
		{
			int sum = 0;
			
			for(int j = 0; j < arr[i].length; j++)
			{
				sum = sum + arr[i][j];
			}
			System.out.println("Sum of "+ (i+1) + " row is : "+sum);
			
			int sumCol = 0;
			
			for(int k = 0; k < arr[i].length; k++)
			{
				sumCol = sumCol + arr[k][i];
			}
			System.out.println("Sum of "+ (i+1) + " col is : "+sumCol);
		}

	}

}
