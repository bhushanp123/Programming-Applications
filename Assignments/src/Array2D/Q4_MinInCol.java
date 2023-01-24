package Array2D;

import java.util.Scanner;

public class Q4_MinInCol {

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
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			int min = arr[0][i];
			
			for(int j = i; j < arr[i].length; j = j+3)
			{
				if( arr[i][j] < min)
				{
					min = arr[i][j];
				}
				
			}
			System.out.println("Min element at " + (i+1) + " col is : "+min);
		}
		

	}

}
