package Assignemt_21jan;

import java.util.Arrays;

public class Q13_Abbreviation {

	public static void main(String[] args) {
		String str = "Bhushan Sopan Pawar";
		
		str = str.trim();
		
		String arr[] = str.split(" ");
		
		int spaces = arr.length - 1;
		
		int cnt = 0;
		
		for(int i = 0; i < spaces; i++)
		{
			arr[i] = arr[i].replaceFirst(arr[i], arr[i].charAt(0)+ ".");
		}
		
		str = Arrays.toString(arr);
		
		System.out.println(str);
		
	}

}
