package Assignment3;

public class Student2 {
	int id = 5;
	String name = "Bhushan";
	
	void display()
	{
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		
		s1.display();
		
		Student2 s2 = new Student2();
		
		s2.id = s1.id;
		s2.name = s1.name;
		
		s2.display();
		
	}

}
