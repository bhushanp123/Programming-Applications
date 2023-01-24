package stringAssign;

import java.util.Scanner;

public class FirstOccur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		//String str = new String(s);
		
		System.out.println("Enter the character : ");
		char c = sc.next().charAt(0);
		
		char ch[] = s.toCharArray();
		
		int flag = 0;
		int i = 0;
		
		for(i = 0; i < ch.length; i++)
		{
			if(ch[i] == c)
			{
				flag = 1;
				break;
			}
		}
		System.out.println("Character first occures at position : "+i);
	}

}
