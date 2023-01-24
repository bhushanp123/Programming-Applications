package Assignment_14jan;

public class Q4_MinCharacter {

	public static void main(String[] args) {
		char arr[] = {'A','D','E','x','z','R'};
		
		char min = arr[0];
		
		for(int i = 0; i < arr.length; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}

		}
		System.out.println("Min character is : "+min);

	}

}
