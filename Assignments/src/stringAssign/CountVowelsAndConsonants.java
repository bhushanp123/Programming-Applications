package stringAssign;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {
		String s = "Bhushan Pawar";
		
		s = s.toLowerCase();
		
		char ch[] = s.toCharArray();
		
		int vowel = 0, cons = 0;

		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				vowel++;
			}
			else if(ch[i] >= 'a' && ch[i] <= 'z')
			{
				cons++;
			}
		}
		System.out.println("No of vowels are : "+vowel);
		System.out.println("No of consonants are : "+cons);

	}

}
