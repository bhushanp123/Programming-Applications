package assignment_7;

import java.util.Scanner;

public class Q7_CheckSameElements {

	public static void main(String[] args) {

		int arr[] = {2,3,15,15,3,2};
		
		int flag = 0;
		int i = 0,j = 0;
		int cnt = 0;
		
		for(i = 0, j = arr.length-1; i < arr.length/2; i++,j--)
		{
			if(arr[i] == arr[j])
			{
				flag = 1;
				cnt++;
			}
		}
		if(flag == 1 && cnt == arr.length/2)
		{
			System.out.println("Elements are same");
		}
		else
		{
			System.out.println("Elements are different");
		}

	}

}
