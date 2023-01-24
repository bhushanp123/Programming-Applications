package Assignment3;

public class Student {
	int id = 1;
	String name = "Bhushan";
	

	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println(s.id);
		System.out.println(s.name);
		
		s.id = 5;
		s.name = "Ram";
		
		System.out.println(s.id);
		System.out.println(s.name);
	}

}
