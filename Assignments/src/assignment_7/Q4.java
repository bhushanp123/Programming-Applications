package assignment_7;

import java.util.Scanner;

class Array4
{
	public void display(int arr[])
	{
		int cnt[] = new int[5];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > 0)
			{
				cnt[0]++;
			}
			else if(arr[i] < 0)
			{
				cnt[1]++;
			}
			
			if(arr[i] % 2 == 0)
			{
				cnt[2]++;
			}
			else if(arr[i] % 2 != 0)
			{
				cnt[3]++;
			}
			
			if(arr[i] == 0)
			{
				cnt[4]++;
			}
		}

		System.out.println("No of positive nos : "+cnt[0]);
		System.out.println("No of negative nos : "+cnt[1]);
		System.out.println("No of even nos : "+cnt[2]);
		System.out.println("No of odd nos : "+cnt[3]);
		System.out.println("No of 0s : "+cnt[4]);

	}
}

public class Q4 {

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
		
		Array4 a = new Array4();
		
		a.display(arr);

	}

}
