package Assignemt_21jan;

import java.util.Arrays;
import java.util.Scanner;

public class Q12_ReplaceFirstOcc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1 = "Bhushan";
		String s2 = "Pawarxx";
		
		System.out.println("Enter the character : ");
		char c = sc.next().charAt(0);
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		for(int i = 0; i < ch1.length; i++)
		{
			if(ch1[i] == c)
			{
				char temp = ch1[i];
				ch1[i] = ch2[i];
				ch2[i] = temp;
				
				break;
			}
		}
		
		s1 = Arrays.toString(ch1);
		s2 = Arrays.toString(ch2);

		
		System.out.println(s1);
		System.out.println(s2);
	}

}
