package Assignemt_21jan;

public class Q8_RemoveFirstAndLastOcc {

	public static void main(String[] args) {
		String s = "Java is programming is language";
		
		String arr[] = s.split(" ");
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].equals("is"))
			{
				s = s.replace("is", "");
				break;
			}
			
		}
		for(int i = arr.length-1; i >= 0; i--)
		{
			if(arr[i].equals("is"))
			{
				s = s.replace("is", "");
				break;
			}
			
		}
		System.out.println(s);
		
		
	}

}
