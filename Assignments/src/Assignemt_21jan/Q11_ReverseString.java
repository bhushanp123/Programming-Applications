package Assignemt_21jan;

public class Q11_ReverseString {

	public static void main(String[] args) {
		String s = "Bhushan Pawar";
		
		StringBuffer sb = new StringBuffer(s);
		
		sb.reverse();
		
		s = sb.toString();
		
		System.out.println(sb);
	}

}
