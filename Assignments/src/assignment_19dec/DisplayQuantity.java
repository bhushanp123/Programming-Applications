package assignment_19dec;

import java.util.Scanner;

public class DisplayQuantity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int total = 500;
		float milk = 0.0f;
		float oil = 0.0f;
		
		while(true)
		{
			float mixture = 0.0f;
			
			System.out.println("Enter the quantity of milk");
			milk = milk + sc.nextFloat();
			
			System.out.println("Enter the quantity of oil");
			oil = oil + sc.nextFloat();
			
			mixture = mixture + ((40 * milk) + (50 * oil));
			
			if(mixture > total)
			{
				break;
			}
		}
		
		System.out.println("Quantity of milk is : "+ milk);
		System.out.println("Quantity of oil is : "+ oil);
		
		
		
		sc.close();
	}

}
