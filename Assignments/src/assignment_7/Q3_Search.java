package assignment_7;

import java.util.Scanner;

class Array3
{
	public void display(int arr[],int search)
	{
		int flag = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == search)
			{
				flag = 1;
				break;
			}
			
		}
		if(flag == 1)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
	}
}

public class Q3_Search {

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
		
		System.out.println("Enter the element to be search");
		int search = sc.nextInt();
		
		Array3 a = new Array3();
		
		a.display(arr,search);

	}

}
