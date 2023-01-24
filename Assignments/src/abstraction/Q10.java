package abstraction;

interface MusicalInstrument
{
	void play();
	
	static void learnInstruent()
	{
		System.out.println("Welcome");
	}
}

abstract class Sound implements MusicalInstrument
{
	abstract void listenSound();
}
class PercussionInstrument extends Sound implements MusicalInstrument
{
	public void play() 
	{
		System.out.println("PercussionInstrument Play");
	}
	public void listenSound()
	{
		System.out.println("PercussionInstrument listenSound");
	}
	
}
class StringedInstrument extends Sound implements MusicalInstrument 
{
	public void play() 
	{
		System.out.println("StringedInstrument Play");
	}
	public void listenSound()
	{
		System.out.println("StringedInstrument listenSound");
	}
}


public class Q10 {

	public static void main(String[] args) {
		PercussionInstrument Tabla = new PercussionInstrument();
		
		MusicalInstrument.learnInstruent();
		Tabla.play();
		Tabla.listenSound();
		
		StringedInstrument Violin = new StringedInstrument();
		
		MusicalInstrument.learnInstruent();
		Violin.play();
		Violin.listenSound();
	}

}
