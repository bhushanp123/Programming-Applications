package assignment_7;

import java.util.Scanner;

class Array15
{
	public void display(int arr[])
	{
		System.out.println("The elements are : ");
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 10 == 9)
			{
				arr[i] = 0;
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}

public class Q15_Replace {

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
		
		Array15 a = new Array15();
		
		a.display(arr);

	}

}
