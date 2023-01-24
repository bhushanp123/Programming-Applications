package assignment_7;

import java.util.Scanner;

class Array2
{
	public void display(int arr[])
	{
		System.out.println("The elements are : ");
		
		for(int i = 0; i < arr.length; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(arr[i]);
			}
			
		}
	}
}

public class Q2_Alternate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the elements : ");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Array2 a = new Array2();
		
		a.display(arr);

	}

}
