package abstraction;

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

	@Override
	public void eat() 
	{
		System.out.println("Inside eat");
	}


	@Override
	public void drink() 
	{
		System.out.println("Inside drink");
	}
	
}

public class Q8 {

	public static void main(String[] args) {
		IceCream i = new Mastani();
		i.eat();
		
		Juice j = new Mastani();
		j.drink();
	}

}
