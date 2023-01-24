package Assignment31_Dec;

public class Cycle {
	int accountNo;
	int noOfWheels;
	
	public Cycle()
	{
		System.out.println("I am default constructor");
	}
	public Cycle(int accountNo,int noOfWheels)
	{
		this();
		System.out.println("I am another constructor");
	}
	
	public static void main(String[] args) {
		Cycle c = new Cycle(123,2);
		
	}
}
