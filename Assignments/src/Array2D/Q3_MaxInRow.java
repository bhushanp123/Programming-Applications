package Array2D;

import java.util.Scanner;

public class Q3_MaxInRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[2][3];
		
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
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			int max = arr[i][0];
			
			for(int j = 0; j < arr[i].length; j++)
			{
				if( arr[i][j] > max)
				{
					max = arr[i][j];
				}
				
			}
			System.out.println("Max element at " + (i+1) + " row is : "+max);
		}

	}

}
