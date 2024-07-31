package array_javaT;

public class Second_Smallest 						// logic --->> first 
{
	public static void main(String[] args) 
	{
		
	
		int array[] = {34, 65, 87, 98, 56, 78, 56, 45, 84, 34};
		
		int firstmin= array[0];
		int SecondMin = Integer.MAX_VALUE;
		
		for (int i = 1; i < array.length; i++) 
		{
			if(firstmin>array[i])
			{
				firstmin= array[i];
			}
		}
		
		for (int i = 1; i < array.length; i++) 
		{
			if(SecondMin>array[i]&& array[i]!=firstmin)
			{
				SecondMin = array[i];
			}
		}
		
		System.out.println(" Second minimum value is : "+ SecondMin);
		
		
	}
}
