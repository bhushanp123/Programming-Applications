package assignment_24dec;

import java.util.Scanner;

class BillGeneration
{
	String name;
	int pizzaQty;
	int puffsQty;
	int cooldrinkQty;
	int totalBill;
	
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name");
		name = sc.nextLine();
		
		System.out.println("Enter the no of pizzas bought");
		pizzaQty = sc.nextInt();
		
		System.out.println("Enter the no of puffs bought");
		puffsQty = sc.nextInt();
		
		System.out.println("Enter the no of cool drinks bought");
		cooldrinkQty = sc.nextInt();
	}
	
	public void calculateBill()
	{
		totalBill = (100 * pizzaQty) + (20 * puffsQty) + (10 * cooldrinkQty);
	}
	
	public void displayData()
	{
		System.out.println("Bill details : ");
		System.out.println("Your name is : "+name);
		System.out.println("No of pizzas : "+pizzaQty);
		System.out.println("No of puffs : "+puffsQty);
		System.out.println("No of cooldrinks : "+cooldrinkQty);
		System.out.println("Total price : "+totalBill);
		System.out.println("ENJOY THE SHOW !!!");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		BillGeneration obj = new BillGeneration();
		
		obj.acceptData();
		obj.calculateBill();
		obj.displayData();

	}

}
