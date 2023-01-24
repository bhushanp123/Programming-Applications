package Assignment31_Dec;

public class Employee {
	int id;
	String name;
	static String company_name; 
	
	static
	{
		company_name = "XYZ";
	}
	
	public static void display()
	{
		System.out.println("Company name is : "+company_name);
	}
	
}
