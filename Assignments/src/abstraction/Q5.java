package abstraction;

class Base
{
	public final void display()
	{
		System.out.println("Inside base");
	}
}

class Derived extends Base
{
	/*public void display()
	{
		System.out.println("Inside base");
	}*/
}

public class Q5 {

	public static void main(String[] args) {
		Derived d = new Derived();
		
		d.display();
	}

}
