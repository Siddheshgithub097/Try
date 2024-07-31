package array_javaT;

public class CopyAll_elemen 
{
	public static void main(String[] args) 
	{
		int arr [] = {1,2,3,4,5,6};
		
		int arr2 [] = new int[arr.length];
		
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i] = arr[i];
		}
		System.out.println(" first array ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]+" ");
		}
		
		System.out.println(" Second array ");
		for (int i = 0; i < arr2.length; i++) 
		{
			System.out.println(arr2[i]+" ");
		}
	}
}
