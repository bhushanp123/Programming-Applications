package inheritance.aggrigation;

public class Mobile1 {
	String companyName;
	int ramSize;
	int price;
	
	Mobile1(String companyName, int ramSize, int price)
	{
		this.companyName = companyName;
		this.ramSize = ramSize;
		this.price = price;
	}
	
	public String toString()
	{
		return companyName + " " + ramSize + " " + price;
	}
}
