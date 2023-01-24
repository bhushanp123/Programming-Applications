package Assignemt_21jan;

import java.util.Arrays;

public class Q7_TrimWhiteSpace {

	public static void main(String[] args) {
		String s = "     Bhushan Pawar     ";
		String s1 = "     Bhushan Pawar     ";
		
		System.out.println(s);
		
		System.out.println("String after removing white spaces using trim method : ");
		
		s1 = s1.trim();
		
		System.out.println(s1);
		
		System.out.println("String after removing leading white spaces without trim method : ");
		
		StringBuffer sb = new StringBuffer(s);
	
		while(sb.charAt(0) == ' ')
		{	
			sb.deleteCharAt(0);
		}
		
		while(sb.charAt(sb.length()-1) == ' ')
		{
			sb.deleteCharAt(sb.length()-1);
		}

		s = sb.toString();
		
		System.out.println(s);
		
	}

}
