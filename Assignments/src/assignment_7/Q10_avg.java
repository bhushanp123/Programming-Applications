package assignment_7;

import java.util.Scanner;

class Array10
{
	public static int average(int arr[])
	{
		int sum = 0,avg = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		
		avg = sum / arr.length;
		
		return avg;
	}
}

public class Q10_avg {

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
		
		int ret = Array10.average(arr);
		System.out.println("Average is : "+ret);
	}

}
