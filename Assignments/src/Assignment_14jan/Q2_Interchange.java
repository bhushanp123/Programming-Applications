package Assignment_14jan;

public class Q2_Interchange {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		int brr[] = {5,6,7,8};
		
		if(arr.length != brr.length)
		{
			System.out.println("Unable to swap size differs");
		}
		else if(arr.length <= 0 || brr.length <= 0)
		{
			System.out.println("Invalid range");
		}
		else
		{
			
			for(int i = 0,j = 0; i < arr.length; i++,j++)
			{
				int temp = brr[j];
				brr[j] = arr[i];
				arr[i] = temp;
			}
			System.out.println("First Array after swapping is : ");
			for(int a : arr)
			{
				System.out.println(a);
			}
			
			System.out.println("Second Array after swapping is : ");
			
			for(int b : brr)
			{
				System.out.println(b);
			}
		}
		
		
	}

}
