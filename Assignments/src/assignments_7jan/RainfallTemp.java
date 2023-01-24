package assignments_7jan;

import java.util.Scanner;

public class RainfallTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of days");
		int days = sc.nextInt();
		
		float temp[] = new float[days];
		
		System.out.println("Enter the temperature : ");
		
		for(int i = 0; i < temp.length; i++)
		{
			temp[i] = sc.nextFloat();
		}
		
		float sum = 0;
		
		for(int i = 0; i < temp.length; i++)
		{
			sum = sum + temp[i];
		}
		
		float avgTemp = sum / days;
		System.out.println("Avg temp is : "+avgTemp);
	}

}
