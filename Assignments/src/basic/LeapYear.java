package basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year = sobj.nextInt();
		
		if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println("Year is leap");
		}
		else
		{
			System.out.println("Year is not leap");
		}

	}

}
