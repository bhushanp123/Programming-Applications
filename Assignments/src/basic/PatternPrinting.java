package basic;

public class PatternPrinting {

	public static void main(String[] args) {
		
		int rows = 3;
		for(int i = 1; i <= rows; i++)
		{
			int j = 1;
			
			for(int sp = 1; sp <= rows-i; sp++)
			{
				System.out.print(" ");
			}
			for(j = 1; j <=i; j++)
			{
				System.out.print(j);
			}
			for(int k = j-1; k >= 1; k--)
			{
				if(i > 1)
				{
					System.out.print(k);
				}
				
			}
			
			System.out.println();
		}

	}

}
