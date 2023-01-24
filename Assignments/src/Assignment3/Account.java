package Assignment3;

import java.util.Scanner;

public class Account {
	String a_no;
	String name;
	int balance;
	
	void insert()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account holder name");
		name = sc.nextLine();
		
		System.out.println("Enter the account number");
		a_no = sc.next();
		
		System.out.println("Enter the amount ");
		balance = sc.nextInt();
	}
	void display()
	{
		System.out.println(name);
		System.out.println(a_no);
		System.out.println(balance);
	}
	void deposite()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount to deposite");
		int amountDeposite = sc.nextInt();
		
		balance = balance + amountDeposite;
	}
	void withdraw()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount to deposite");
		int amountWithdraw = sc.nextInt();
		
		balance = balance - amountWithdraw;
	}
	void checkBalance()
	{
		System.out.println(balance);
	}

	public static void main(String[] args) {
		Account obj = new Account();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 : Insert");
		System.out.println("2 : Display");
		System.out.println("3 : Deposite");
		System.out.println("4 : Withdraw");
		System.out.println("5 : Check balance");
		System.out.println("6 : Exit");
		
		do
		{	
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				{
					obj.insert();
					break;
				}
				case 2:
				{
					obj.display();
					break;
				}
				case 3:
				{
					obj.deposite();
					break;
				}
				case 4:
				{
					obj.withdraw();
					break;
				}
				case 5:
				{
					obj.checkBalance();
					break;
				}
				case 6:
				{
					System.exit(0);
					break;
				}
			}
		}while(true);
		
			
	}

}
