package array_Pree;

public class SecondSmallest 
{
	public static void main(String[] args) 
	{
		int array[] = {36, 65, 87, 98, 56, 78, 56, 45, 84, 34};
		
		int firstsmallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) 
		{
			if(firstsmallest>array[i])
			{
				secondsmallest = firstsmallest;
				firstsmallest= array[i];
			}
			else if ( secondsmallest>array[i])
			{
				secondsmallest = array[i];
			}
		}
		
		System.out.println(" second Smallest value is "+ secondsmallest);
	}
}
