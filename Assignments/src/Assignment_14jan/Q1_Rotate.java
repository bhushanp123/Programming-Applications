package Assignment_14jan;

public class Q1_Rotate {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		int rotation = 3;
		int i = 0;
		
		for(int j = 0; j < rotation; j++)
		{
			int temp = arr[0];
			
			for(i = 0; i <arr.length-1;i++)
			{
				arr[i] = arr[i+1];
			}
			arr[i] = temp;
		}
		
		
		for(int a : arr)
		{
			System.out.println(a);
		}
		
	}

}
