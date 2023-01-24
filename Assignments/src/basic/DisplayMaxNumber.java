package basic;

import java.util.Scanner;

public class DisplayMaxNumber {

	public static void main(String[] args) {
Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int number1 = sobj.nextInt();
		
		System.out.println("Enter second number");
		int number2 = sobj.nextInt();
		
		System.out.println("Enter third number");
		int number3 = sobj.nextInt();
		
		if((number1 > number2) && (number1 > number3))
		{
			System.out.println(number1 + " is maximum number");
		}
		else if((number2 > number1) && (number2 > number3))
		{
			System.out.println(number2 + " is maximum number");
		}
		else
		{
			System.out.println(number3 + " is maximum number");
		}
	}

}
