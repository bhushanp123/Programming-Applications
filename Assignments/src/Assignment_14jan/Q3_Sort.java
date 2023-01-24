package Assignment_14jan;

public class Q3_Sort {

	public static void main(String[] args) {
		int arr[] = {89,23,56,12,99};
		
		
		
		for(int i = 0; i < arr.length-1; i++)
		{
			if(i < arr.length/2)
			{
				if(arr[i] > arr[i+1])
				{
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
			else
			{
				if(arr[i] < arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		for(int a : arr)
		{
			System.out.println(a);
		}
	}

}
