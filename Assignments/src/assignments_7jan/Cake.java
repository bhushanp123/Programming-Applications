package assignments_7jan;

public interface Cake {
	void bake();

}

class Strawberry implements Cake
{
	@Override
	public void bake() {
		System.out.println("Strawberry cake");
		
	}
	
}

class BlackForest implements Cake
{
	@Override
	public void bake() {
		System.out.println("BlackForest cake");
		
	}
	
}