package class_object;

public class Laptop {
	
	String name = "Bhushan";
	String companyName = "Lenovo";
	String microprocessor = "Intel i7";
	String os = "Windows 10";
	int ramSize = 4;
	int hardDisk = 1;
	int price = 55000;
	
	void display()
	{
		System.out.println("Name is : "+name);
		System.out.println("Name of company : "+companyName);
		System.out.println("Name of microprocessor : "+microprocessor);
		System.out.println("Name of os is : "+os);
		System.out.println("Ram size is : " + ramSize + " GB");
		System.out.println("Hard disk size is : " + hardDisk + " TB");
		System.out.println("Total bill is : "+price);
	}

	public static void main(String[] args) {
		Laptop obj = new Laptop();
		obj.display();
		
		System.out.println("-------------------------------");
		
		obj.ramSize = 8;
		obj.price = 65000;
		
		obj.display();
	}

}
