package basic;

import java.util.Scanner;

public class LeapYearTernary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year");
		int year = sc.nextInt();
		
		String result = (year % 4 ==0 && year % 100 != 0) ? "Year is leap" : (year % 100 == 0 && year % 400 == 0) ? "Year is leap" : "Year is not leap";
		
		System.out.println(result);
	}

}
