package stringAssign;

import java.util.Arrays;

public class StringReverse {

	public static void main(String[] args) {
		String s = "Bhushan Pawar";
		
		char ch[] = s.toCharArray();

		for(int i = 0; i < ch.length/2; i++)
		{
			char temp = ch[i];
			ch[i] = ch[ch.length-1-i];
			ch[ch.length-1-i] = temp;
		}
		
		//s = Arrays.toString(ch);
		
		System.out.println(ch);
	}

}
