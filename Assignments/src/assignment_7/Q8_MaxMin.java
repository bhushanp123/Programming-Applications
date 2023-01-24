package assignment_7;

import java.util.Scanner;

class Array8
{
	public void display(int arr[])
	{
		int max = arr[0];
		int min = arr[0];
		//System.out.println("The elements are : ");
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println("Max element is : "+max);
		System.out.println("Min element is : "+min);
	}
}

public class Q8_MaxMin {

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
		
		Array8 a = new Array8();
		
		a.display(arr);

	}

}
