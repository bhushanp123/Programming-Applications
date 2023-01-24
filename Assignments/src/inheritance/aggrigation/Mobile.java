package inheritance.aggrigation;

public class Mobile {
	String companyName;
	int ramSize;
	int price;
	
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	
	public void setRamSize(int ramSize)
	{
		this.ramSize = ramSize;
	}
	public int getRamSize()
	{
		return ramSize;
	}
	
	public void setprice(int price)
	{
		this.price = price;
	}
	public int getprice()
	{
		return price;
	}

	public String toString()
	{
		return companyName + " " + ramSize + " " + price;
	}
}
