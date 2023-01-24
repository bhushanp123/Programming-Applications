package Array2D;

import java.util.Scanner;

public class Q5_OuterElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[4][4];
		
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
		
		System.out.println("Outer elements are : ");
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				if(i == 0 || i == arr.length-1 || j == 0 || j == arr[i].length-1)
				{
					System.out.print(arr[i][j] + "\t");
				}
				else
				{
					System.out.print("\t");
				}

			}
			System.out.println();
		}
	}

}
