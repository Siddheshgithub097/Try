package array_javaT;

public class Second_Smallest1 
{
	public static void main(String[] args) 
	{
		int array[] = {34, 65, 87, 98, 56, 78, 56, 45, 84, 34};
		
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(firstSmallest>array[i])
			{
				secondSmallest=firstSmallest;
				firstSmallest= array[i];
			}
			else if( secondSmallest>array[i] && array[i]!=firstSmallest)
			{
				secondSmallest= array[i];
			}
		}
		
		System.out.println(" second smallest value is "+ secondSmallest);
	}
}
