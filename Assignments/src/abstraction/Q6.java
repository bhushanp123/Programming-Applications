package abstraction;

interface Cake
{
	void bake();
}

class Strawberry implements Cake
{

	@Override
	public void bake() 
	{
		System.out.println("Strawberry Cake");
	}
	
}

class BlackForest implements Cake
{

	@Override
	public void bake() 
	{
		System.out.println("BlackForest Cake");
	}
	
}

public class Q6 {

	public static void main(String[] args) {
		Cake c;
		c = new Strawberry();
		c.bake();
		
		c = new BlackForest();
		c.bake();

	}

}
