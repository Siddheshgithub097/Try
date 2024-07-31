package array_javaT;

public class Smallest 
{
	public static void main(String[] args) {
		int [] arr = new int [] {25, 11, 7, 75, 56};  
		
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
			if(smallest>arr[i])
			{
				smallest= arr[i];
				
			}
		}
		
		System.out.println(" smallest value of array is "+smallest);
	}
}
