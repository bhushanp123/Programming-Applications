package assignment_24dec;

import java.util.Scanner;

class HighestPlacement
{
	int CSE_Students;
	int ECE_Students;
	int MECH_Students;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of students placed in CSE");
		CSE_Students = sc.nextInt();
		
		System.out.println("Enter the no of students placed in ECE");
		ECE_Students = sc.nextInt();
		
		System.out.println("Enter the no of students placed in MECH");
		MECH_Students = sc.nextInt();
	}
	
	public void display()
	{
		if(CSE_Students < 0 || ECE_Students < 0 || MECH_Students < 0)
		{
			System.out.println("Input is invalid");
			return;
		}
		else if(CSE_Students == 0 && ECE_Students == 0 && MECH_Students == 0)
		{
			System.out.println("None of the department has got the maximum placement");
			return;
		}
		
		if(CSE_Students >= ECE_Students && CSE_Students >= MECH_Students)
		{
			if(CSE_Students == ECE_Students)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
				System.out.println("ECE");	
			}
			else if(CSE_Students == MECH_Students)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
				System.out.println("MECH");	
			}
			else
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
			}
		}
		else if(ECE_Students >= CSE_Students && ECE_Students >= MECH_Students)
		{
			if(ECE_Students == CSE_Students)
			{
				System.out.println("Highest placement");
				System.out.println("CSE");
				System.out.println("ECE");	
			}
			else if(ECE_Students == MECH_Students)
			{
				System.out.println("Highest placement");
				System.out.println("ECE");
				System.out.println("MECH");	
			}
			else
			{
				System.out.println("Highest placement");
				System.out.println("ECE");
			}
		}
		else
		{
			System.out.println("Highest placement");
			System.out.println("MECH");
		}

	}
}

public class PlacementMain {

	public static void main(String[] args) {
		HighestPlacement obj = new HighestPlacement();
		
		obj.accept();
		obj.display();
	}

}
