package assignment_7;

import java.util.Scanner;

class Array16
{
	public void display(int arr[])
	{
		System.out.println("Pairs of addition 10 is : ");
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == 10)
				{
					System.out.println(arr[i] + " & " + arr[j]);
				}
			}
		}

	}
}

public class Q16_Pairs {

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
		
		Array16 a = new Array16();
		
		a.display(arr);

	}

}
