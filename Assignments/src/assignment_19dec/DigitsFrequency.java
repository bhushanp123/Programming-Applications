package assignment_19dec;

import java.util.Scanner;

public class DigitsFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
	
		int rem = 0;
			
		for(int i = 0;i < 9; i++)
		{
			int cnt = 0;
			int temp = num;
			
			while(temp > 0)
			{
				rem = temp % 10;
				
				if(rem == i)
				{
					cnt++;
				}
			
				temp = temp / 10;
			}
			if(cnt > 0)
			{
				System.out.println(i + " freq. is : "+cnt);
			}	
		}
	}

}
