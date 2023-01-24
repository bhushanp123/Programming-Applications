package Assignemt_21jan;

public class Q17_LargestAndSmallestWord {

	public static void main(String[] args) {
		String str = "This is an umbrella";
		
		String arr[] = str.split(" ");
		
		int i = 0;
		int max = 0,min = arr[i].length();
		int posL = 0,posS = 0;
		
		for(i = 0; i < arr.length; i++)
		{
			if(arr[i].length() > max)
			{
				max = arr[i].length();
				posL = i;
			}
			
			if(arr[i].length() < min)
			{
				min = arr[i].length();
				posS = i;
			}
		}
		System.out.println("Largest word is : "+arr[posL]);
		System.out.println("Smallest word is : "+arr[posS]);
	}

}
