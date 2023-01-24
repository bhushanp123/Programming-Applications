package assignment_7;

import java.util.Scanner;

class Array5
{
	public void copy(int arr[],int brr[])
	{
		System.out.println("The elements are : ");
		
		for(int i = arr.length-1; i >= 0; i--)
		{
			brr[i] = arr[i];
			System.out.println(brr[i]);
		}
	}
}

public class Q5_CopyAndReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		int brr[] = new int[size];
		
		System.out.println("Enter the elements : ");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Array5 a = new Array5();
		
		a.copy(arr,brr);

	}

}
