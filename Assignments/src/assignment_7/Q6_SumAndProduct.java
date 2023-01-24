package assignment_7;

import java.util.Scanner;

class Array6
{
	public void display(int arr[])
	{
		int sum = 0;
		int mult = 1;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
			mult = mult * arr[i];
		}
		System.out.println("Addition of the elements is : "+sum);
		System.out.println("Product of the elements is : "+mult);
	}
}

public class Q6_SumAndProduct {

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
		
		Array6 a = new Array6();
		
		a.display(arr);

	}

}
