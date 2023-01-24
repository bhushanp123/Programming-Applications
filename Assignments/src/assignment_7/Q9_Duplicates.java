package assignment_7;

import java.util.Scanner;

class Array9
{
	public void display(int arr[])
	{
		System.out.println("Duplicate elements are : ");
		
		int dupCnt = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			boolean visited = false;
			int cnt = 0;
			
			for(int j = i-1; j >= 0; j--)
			{
				if(arr[i] == arr[j])
				{
					visited = true;
					break;
				}
				
			}
			if(visited == false)
			{
				for(int j = i+1; j < arr.length; j++)
				{
					if(arr[i] == arr[j])
					{
						cnt++;
					}
				}
			}
			
			if(cnt > 0)
			{
				dupCnt++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("Total no of duplicate elements : "+dupCnt);
		
	}
}

public class Q9_Duplicates {

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
		
		Array9 a = new Array9();
		
		a.display(arr);

	}

}
