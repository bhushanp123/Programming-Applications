package assignment_7;

public class AdditionOfAlternateElements {

	public static void main(String[] args) {
		int arr[] = {2,5,6,7,3,9};
		
		for(int i = 0; i < arr.length-2; i++)
		{
			
			if(i % 2 == 0)
			{
				System.out.println(arr[i] + arr[i+2]);
			}
			else
			{
				System.out.println(arr[i] + arr[i+2]);
			}

		}
	}

}
