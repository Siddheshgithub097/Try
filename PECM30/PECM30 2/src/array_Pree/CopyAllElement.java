package array_Pree;

public class CopyAllElement 
{
	public static void main(String[] args) 
	{
		int arr [] = {1,2,3,5,6,7,8,9};
		
		int arr2 [] = new int[arr.length];
		
		for (int i = 0; i < arr2.length; i++) 
		{
			arr2[i] = arr[i];
		}
		
		System.out.println(" first array ");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
		System.out.println(" second array ");
		for (int i = 0; i < arr2.length; i++) 
		{
			System.out.println(arr2[i]+" ");
		}
	}
}
