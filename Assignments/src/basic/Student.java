package basic;

public class Student {

	public static void main(String[] args) {
		
		int num1 = 72;
		int num2 = 82;
		int num3 = 64;
		int num4 = 92;
		int num5 = 89;
		
		int total = (num1 + num2 + num3 + num4 + num5);
		System.out.println("Total is : "+total);
		
		float average = (num1 + num2 + num3 + num4 + num5)/5;
		System.out.println("Average is : "+average);
		
		float percentage = (total / 500.0f) * 100;
		System.out.println("Percentage is : "+percentage + "%");
		
		if(percentage >= 80)
		{
			System.out.println("Your grade is : A+");
		}
		else if((percentage >= 70) && (percentage < 80))
		{
			System.out.println("Your grade is : A");
		}
		else if((percentage >= 60) && (percentage < 70))
		{
			System.out.println("Your grade is : B+");
		}
		else if((percentage >= 50) && (percentage < 60))
		{
			System.out.println("Your grade is : B");
		}
		else if((percentage >= 35) && (percentage < 50))
		{
			System.out.println("Your grade is : c");
		}
		else
		{
			System.out.println("You are fail");
		}
	}

}
