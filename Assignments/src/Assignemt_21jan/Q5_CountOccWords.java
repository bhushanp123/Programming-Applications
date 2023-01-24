package Assignemt_21jan;

public class Q5_CountOccWords {

	public static void main(String[] args) {
		String str = "hello world hello";
		
		String s[] = str.split(" ");
		
		int cnt = 0;
		
		for(int i = 0; i < s.length; i++)
		{
			if(s[i].equals("hello"))
			{
				cnt++;
			}
		}
		System.out.println("Word occures "+ cnt + " times");
	}

}
