package abstraction;

class Demo
{
	//public final int x;
	
	public final void display()
	{
		System.out.println("Inside Demo display");
	}
	
}
//final class DemoChild extends Demo
class DemoChild extends Demo
{
	/*public void display()
	{
		System.out.println("Inside DemoChild display");
	}*/
}

/*class DemoX extends DemoChild
{
	
}*/

public class Q4 {

	public static void main(String[] args) {
		Demo d = new Demo();
		
		//d.x = 20;

	}

}
