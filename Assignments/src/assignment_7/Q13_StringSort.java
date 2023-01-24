package assignment_7;

import java.util.Scanner;

class Array13
{
	public void display(String arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				if(arr[i].length() < arr[j].length())
				{
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				else if(arr[i].length() == arr[j].length())
				{
					if(arr[i].charAt(0) > arr[j].charAt(0))
					{
						String temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				
			}
		}
		for(String s : arr)
		{
			System.out.println(s);
		}
	}
}

public class Q13_StringSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int size = sc.nextInt();
		
		String arr[] = new String[size];
		
		System.out.println("Enter the elements : ");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.next();
		}
		
		Array13 a = new Array13();
		
		a.display(arr);

	}

}
