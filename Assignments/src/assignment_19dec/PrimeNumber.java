package assignment_19dec;

public class PrimeNumber {

	public static void main(String[] args) {
	
		System.out.println("Prime numbers are : ");
		
		for(int i = 400; i >= 300; i--)
		{
			int flag = 0;
			
			for(int j = 2; j <= i/2; j++)
			{
				if(i % j == 0)
				{
					flag = 1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println(i);
			}

		}
	}

}
