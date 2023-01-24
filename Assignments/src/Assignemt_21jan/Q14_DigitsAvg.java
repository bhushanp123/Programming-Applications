package Assignemt_21jan;

public class Q14_DigitsAvg {

	public static void main(String[] args) {
		String str = "a5i9gfj4abc";
		
		char ch[] = str.toCharArray();
		
		int sum = 0;
		int cnt = 0;
		
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] >= 48 && ch[i] <= 57)
			{
				sum = sum + ch[i] - 48;
				cnt++;
			}
		}
		
		float avg = sum /cnt;
		
		System.out.println("Digits average is : "+avg);
	}

}
