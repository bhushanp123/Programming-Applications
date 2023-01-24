package assignment_24dec;

import java.util.Scanner;

class LuckyNumber
{
	int no;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the car number");
		no = sc.nextInt();
	}
	
	public void displayLuckyNumber()
	{
		if(no < 0 || no == 0)
		{
			System.out.println("Invalid input");
			return;
		}
		
		int temp = no;
		int cnt = 0,rem = 0;
		int sum = 0;
		
		while(no != 0)
		{
			rem = no % 10;
			cnt++;
			sum = sum + rem;
			no = no / 10;
		}
		
		if(cnt != 4)
		{
			System.out.println("Invalid input");
			return;
		}
		
		no = temp;
		
		if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0)
		{
			System.out.println("Lucky number");
		}
		else
		{
			System.out.println("Sorry its not my lucky number");
		}
	}
	
}

public class LuckyNumberMaiin {

	public static void main(String[] args) {
		LuckyNumber obj = new LuckyNumber();
		
		obj.accept();
		obj.displayLuckyNumber();

	}

}
