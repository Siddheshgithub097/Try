package array_javaT;

public class Linear_Search 
{
	public static int linear_search(int array [] , int key )
	{
		for (int i = 0; i < array.length; i++) 
		{
			if(array[i]==key)
			{
				return i ;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int [] array = {1,2,3,4,50,60,70};
		
		int key = 70 ;
		
		System.out.println(key +" is found at index "+ linear_search(array, key));
	}
}
