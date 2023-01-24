package StaticAssignments;

class Car {
	public String model = "Mahindra XUV 300";
	static int totalCarSold = 10;
}

public class CarMain
{
	public static void main(String[] args) {
		Car c = new Car();
		
		System.out.println(c.model);
		System.out.println(Car.totalCarSold);
		
		c.model = "Hundai i20";
		Car.totalCarSold = 20;
		
		System.out.println(c.model);
		System.out.println(Car.totalCarSold);

	}
}

