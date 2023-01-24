package stringAssign;

import java.util.Scanner;

public class LastOccur {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = "Bhushan Pawar";
		
		System.out.println("Enter the character : ");
		char c = sc.next().charAt(0);
		
		char ch[] = s.toCharArray();
		
		int flag = 0;
		int i = 0;
		
		for(i = ch.length-1; i >= 0 ; i--)
		{
			if(ch[i] == c)
			{
				flag = 1;
				break;
			}
		}
		System.out.println("Character last occures at position : "+i);

	}

}
