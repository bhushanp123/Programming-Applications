package abstraction;

interface X
{
	void methodX();
}
class Y implements X
{
	public void methodX()
	{
		System.out.println("Method X");
	}
}

public class Q7 {

	public static void main(String[] args) {
		X obj = new Y();
		
		obj.methodX();

	}

}
