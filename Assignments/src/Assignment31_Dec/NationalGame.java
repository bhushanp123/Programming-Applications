package Assignment31_Dec;

import java.util.Scanner;

public class NationalGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the country name");
		String countryName = sc.nextLine();
		
		switch(countryName)
		{
			case "India":
			{
				System.out.println("National game is Hockey");
				break;
			}
			case "China":
			{
				System.out.println("National game is Table Tennis");
				break;
			}
			case "Bangladesh":
			{
				System.out.println("National game is Kabaddi");
				break;
			}
			case "Italy":
			{
				System.out.println("National game is Football");
				break;
			}
			case "United States":
			{
				System.out.println("National game is Baseball");
				break;
			}
			default:
			{
				System.out.println("There is no such country");
			}
		}

	}

}
