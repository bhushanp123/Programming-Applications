package assignments_7jan;

class IPL
{
	public void play()
	{
		System.out.println("Play the cricket");
	}
}

class CSK extends IPL
{
	
}

class RCB extends IPL
{
	
}

public class IPLMain {

	public static void main(String[] args) {
		CSK c = new CSK();
		
		c.play();

	}

}
