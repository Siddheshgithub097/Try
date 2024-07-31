package array_javaT;

public class Smallest_element 
{
	public static void main(String[] args) 
	{
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		
		int smallest = array[0];
		int SecondSmallest=Integer.MAX_VALUE;
		
		for (int i = 1; i < array.length; i++) 
		{
			if(smallest> array[i])
			{
				smallest = array[i];
			}
		}
		
		for (int i = 0; i < array.length; i++) 
		{
			if(SecondSmallest>array[i]&& array[i]!=smallest)
			{
				SecondSmallest= array[i];
			}
			
		}
		System.out.println(smallest + " is the smallest value of an array"  );
		System.out.println(SecondSmallest+ " is the Second Smallest value Of an Array ");
	}
}
