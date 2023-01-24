package Assignemt_21jan;

public class Q20_Anagram {

	public static void main(String[] args) {
		String s1 = "Army";
		String s2 = "Mary";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		
		if(ch1.length != ch2.length)
		{
			System.out.println("String is not anagram as string length is not same");
			return;
		}
		
		int freq1[] = new int[26];
		int freq2[] = new int[26];
		
		
		
		for(int i = 0; i < ch1.length; i++)
		{
			
			int pos1 = ch1[i] - 97;
			freq1[pos1]++;
			
			int pos2 = ch2[i] - 97;
			freq2[pos2]++;
		}
		int i = 0;
		
		for(i = 0; i < freq1.length; i++)
		{
			if(freq1[i] > 0)
			{
				//System.out.println((char) (i + 'a') + " Freq in first string is : "+freq1[i]);
				//System.out.println((char) (i + 'a') + " Freq in second string is : "+freq2[i]);
				
				if(freq1[i] != freq2[i])
				{
					break;
				}
			}
		}
		if(i == freq1.length)
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}
	}

}
