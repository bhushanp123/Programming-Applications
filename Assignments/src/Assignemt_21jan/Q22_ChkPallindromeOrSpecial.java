package Assignemt_21jan;

import java.util.Scanner;

public class Q22_ChkPallindromeOrSpecial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "LEVEL";
		
		char arr[] = s.toCharArray();
		
		if(arr[0] == arr[arr.length-1])
		{
			System.out.println("String is special");
		}
		else
		{
			System.out.println("String is not special");
		}
		
		int i = 0;
		
		for(i = 0; i < arr.length/2; i++)
		{
			if(arr[i] != arr[arr.length-1-i])
			{
				break;
			}
		}
		if(i == arr.length/2)
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
	}

}
