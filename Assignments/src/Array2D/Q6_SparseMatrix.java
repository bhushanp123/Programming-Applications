package Array2D;

import java.util.Scanner;

public class Q6_SparseMatrix {

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
		
		int cnt = 0;
		int size = 9;
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(arr[i][j] == 0)
				{
					cnt++;
				}
			}
		}
		
		if(cnt > size/2)
		{
			System.out.println("Sparse matrix");
		}
		else
		{
			System.out.println("Not Sparse matrix");
		}

	}

}
