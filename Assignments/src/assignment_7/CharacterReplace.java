package assignment_7;

public class CharacterReplace {

	public static void main(String[] args) {
		char arr[] = {'a','f','s','y'};
		
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = (char) (arr[i] + 2);
			
			if(arr[i] >= 'z')
			{
				arr[i] = (char) (arr[i] - 26);
			}
			System.out.println(arr[i]);
		}

	}

}
