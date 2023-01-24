package assignments_7jan;

interface IceCream
{
	void eat();
}

interface Juice
{
	void drink();
}

class Mastani implements IceCream,Juice
{
	public void eat()
	{
		System.out.println("Eat the Ice cream");
	}
	public void drink()
	{
		System.out.println("Drink the Juice");
	}
}

public class IceCreameMain {

	public static void main(String[] args) {
		Mastani m = new Mastani();
		
		m.eat();
		m.drink();
	}

}
