package basic;

interface Student1
{
	int no = 10;
	void display();
}

class Test implements Student1
{

	@Override
	public void display() {
		System.out.println("Roll no is : "+Student1.no);
		
	}
	
}

public class Demo1111 {

	public static void main(String[] args) {
		
		Student1 s = new Test();
		
		s.display();
	}

}
