package abstraction;

abstract class Bank
{
	String name;
	
	Bank(String name)
	{
		this.name = name;
	}
	
	void display()
	{
		System.out.println("Welcome to "+ name + "!!!");
	}
	
	abstract void loan();
}

class Hdfc extends Bank
{
	float amount;
	float interestRate;
	
	Hdfc(String name,int amount,float interestRate)
	{
		super(name);
		this.amount = amount;
		this.interestRate = interestRate;
	}
	
	void loan()
	{
		amount = amount + (interestRate * amount)/100;
		System.out.println("You need to pay : "+amount);
	}
}

public class Q3 {

	public static void main(String[] args) {
		Bank b = new Hdfc("HDFC",10000,11.0f);
		
		b.display();
		b.loan();
	}

}
