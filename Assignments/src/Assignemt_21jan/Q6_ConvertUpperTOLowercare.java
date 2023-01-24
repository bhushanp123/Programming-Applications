package Assignemt_21jan;

public class Q6_ConvertUpperTOLowercare {

	public static void main(String[] args) {
		String s = "BhuSHan";
		
		char ch[] = s.toCharArray();

		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] >= 'A' && ch[i] <= 'Z')
			{
				ch[i] = (char) (ch[i] + 32);
			}
		}

		System.out.println(ch);

	}

}
