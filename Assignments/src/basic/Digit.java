package basic;

public class Digit {

	public static void main(String[] args) {
		int no = 2345;
		int rem = 0;
		int min = no % 10;
		
		while(no > 0)
		{
			rem = no % 10;
			if(min > rem)
			{
				min = rem;
				
			}
			no = no / 10;
		}
		System.out.println(min);

	}

}
