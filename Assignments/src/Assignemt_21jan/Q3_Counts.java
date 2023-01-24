package Assignemt_21jan;

public class Q3_Counts {

	public static void main(String[] args) {
		String s = "Bhushan Pawar 123";
		
		s = s.toLowerCase();
		
		char ch[] = s.toCharArray();
		
		int cnt[] = new int[4];

		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				cnt[0]++;
			}
			else if(ch[i] >= 'a' && ch[i] <= 'z')
			{
				cnt[1]++;
			}
			else if(ch[i] >= 48 && ch[i] <= 57)
			{
				cnt[2]++;
			}
			else if(ch[i] == ' ')
			{
				cnt[3]++;
			}
		}
		
		System.out.println("No of vowels are : "+cnt[0]);
		System.out.println("No of consonants are : "+cnt[1]);
		System.out.println("No of digits are : "+cnt[2]);
		System.out.println("No of spaces are : "+cnt[3]);

	}

}
