package assignment_19dec;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int output = num * num;

		int rem = 0,cnt = 0;
		int temp = num;
		
		while(num != 0)
		{
			rem = num % 10;
			cnt++;
			num = num / 10;
		}
		
		num = temp;
		int tempOutput = output;
		
		int rev = 0;
		
		for(int i = 1; i <= cnt; i++)
		{
			rem = output % 10;
			rev = (rev * 10) + rem;
			output = output / 10;
		}

		output = tempOutput;
		int no = 0;
		
		while(rev != 0)
		{
			rem = rev % 10;
			no = (no * 10) + rem;
			rev = rev / 10;
		}
		
		if(num == no)
		{
			System.out.println("Number is Automorphic");
		}
		else
		{
			System.out.println("Number is not Automorphic");
		}
		
		sc.close();
	}

}
