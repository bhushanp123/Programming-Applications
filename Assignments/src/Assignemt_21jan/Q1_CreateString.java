package Assignemt_21jan;

public class Q1_CreateString {

	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "Hi";
		
		if(s1 == s2)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		if(s3 == s4)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}

}
