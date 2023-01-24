// 135 = 1 + 3*3 + 5*5*5

package assignment_19dec;

import java.util.Scanner;

public class Disarum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0,cnt = 0;
		int rem = 0;
		
		while(num != 0)
		{
			rem = num % 10;
			cnt++;
			num = num / 10;
		}
		
		num = temp;
		
		while(num != 0)
		{
			rem = num % 10;
			
			int mult = 1;
			
			for(int j = cnt; j >= 1; j--)
			{
				mult = mult * rem; 

			}
			sum = sum + mult;
			cnt--;
			
			num = num / 10;
		}

		num = temp;
		
		if(sum == temp)
		{
			System.out.println("Number is Disarum");
		}
		else
		{		
			System.out.println("Number is not Disarum");		
		}
		
		sc.close();
	}

}
