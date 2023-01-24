package assignment_24dec;

import java.util.Scanner;

class DisplayCharacters
{
	int no1;
	int no2;
	int no3;
	int no4;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		no3 = sc.nextInt();
		no4 = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("65 - "+(char)no1);
		System.out.println("66 - "+(char)no2);
		System.out.println("67 - "+(char)no3);
		System.out.println("68 - "+(char)no4);
	}
}

public class DisplayCharactersMain {

	public static void main(String[] args) {
		DisplayCharacters obj = new DisplayCharacters();
		
		obj.accept();
		obj.display();

	}

}
