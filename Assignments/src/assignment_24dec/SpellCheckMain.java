package assignment_24dec;

import java.util.Scanner;

class SpellCheck
{
	char firstLetter;
	char secondLetter;
	char thirdLetter;
	char fourthLetter;
	char fifthLetter;
	char sixthLetter;
	char seventhLetter;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first letter");
		firstLetter = sc.next().charAt(0);
		
		System.out.println("Enter the second letter");
		secondLetter = sc.next().charAt(0);
		
		System.out.println("Enter the third letter");
		thirdLetter = sc.next().charAt(0);
		
		System.out.println("Enter the fourth letter");
		fourthLetter = sc.next().charAt(0);
		
		System.out.println("Enter the fifth letter");
		fifthLetter = sc.next().charAt(0);
		
		System.out.println("Enter the sixth letter");
		sixthLetter = sc.next().charAt(0);
		
		System.out.println("Enter the seventh letter");
		seventhLetter = sc.next().charAt(0);
	}
	
	public void checkSpell()
	{
		if(firstLetter == 'R' && secondLetter == 'A' && thirdLetter == 'I' && fourthLetter == 'N' && fifthLetter == 'B' && sixthLetter == 'O' && seventhLetter == 'W')
		{
			System.out.println("RAINBOW");
		}
		else
		{
			System.out.println("The spelling is wrong");
		}
	}
}


public class SpellCheckMain {

	public static void main(String[] args) {
		SpellCheck obj = new SpellCheck();
		
		obj.accept();
		obj.checkSpell();

	}

}
