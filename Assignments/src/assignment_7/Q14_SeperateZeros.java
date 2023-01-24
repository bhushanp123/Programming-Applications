package assignment_7;

import java.util.Scanner;

class Array14
{
	public void display(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			/*for(int j = i; j < arr.length; j++)
			{
				if(arr[i] == 0)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}*/
			int j = arr.length-1;
			
			if(arr[i] == 0)
			{
				if(i!=j &&  arr[i]!=arr[j]) 
				{
				int temp = arr[i];
			
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			}
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}

public class Q14_SeperateZeros {

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
		
		Array14 a = new Array14();
		
		a.display(arr);

	}

}
