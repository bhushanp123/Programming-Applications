package Array2D;

import java.util.Scanner;

public class Q8_Subtract2Matrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][3];
		
		System.out.println("Enter the elements for array arr");
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = sc.nextInt();
			}

		}
		
		int brr[][] = new int[3][3];
		
		System.out.println("Enter the elements for array brr");
		
		for(int i = 0; i < brr.length; i++)
		{
			for(int j = 0; j < brr[i].length; j++)
			{
				brr[i][j] = sc.nextInt();
			}

		}
		
		System.out.println("Elements of array arr: ");
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Elements of array brr: ");
		
		for(int i = 0; i < brr.length; i++)
		{
			for(int j = 0; j < brr[i].length; j++)
			{
				System.out.print(brr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("The subtraction of array elements is : ");
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] - brr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
