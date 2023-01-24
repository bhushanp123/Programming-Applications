package assignment_7;

import java.util.Scanner;

class Array11
{
	public void display(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}

public class Q11_Arrange {

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
		
		Array11 a = new Array11();
		
		a.display(arr);

	}

}
