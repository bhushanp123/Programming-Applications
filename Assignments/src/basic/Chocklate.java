package basic;

import java.util.Scanner;

public class Chocklate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of chocklates");
		int no = sc.nextInt();
		
		int cnt = 0;
		
		for(int i = 1; i <= no; i++)
		{
			cnt++;
			
			if(cnt % 3 == 0)
			{
				cnt++;
			}
		}
		System.out.println("Final qty is : "+cnt);
	}

}
