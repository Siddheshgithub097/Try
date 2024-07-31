package array_javaT;

public class Largest
{
	public static void main(String[] args) {
		int [] arr = new int [] {25, 11, 7, 75, 56};  
		
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) 
		{
			if(largest<arr[i])
			{
				largest= arr[i];
				
			}
		}
		
		System.out.println(" largest value of array is "+largest);
	}
}
