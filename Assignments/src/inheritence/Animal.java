package inheritence;

class Animal {
	String name;
	int legs;
	
	public void display()
	{
		System.out.println("Animals");
	}
	
}

class Dog extends Animal
{
	String name = "Moti";
	int legs = 4;
	
	public void display()
	{
		super.display();
		System.out.println("Pet Animal");
	}
	
}

class Cat extends Animal
{
	String name = "Rani";
	int legs = 4;

	
	public void display()
	{
		super.display();
		System.out.println("Pet Animal");
	}
}
