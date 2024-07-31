package javaConceptOfDay;

public class FindLargestNumberWithoutDigit1 
{
	public static void main(String[] args) 
	{
		System.out.println(findLargestNumber(1490, 9));
	}
	
	public static int findLargestNumber(int number , int digit )
	{
		String AvoidDigit = Integer.toString(digit);
		
		for (int i = number; i >= 0; i--)
		{
			if(!Integer.toString(i).contains(AvoidDigit))
			{
				return i ;
			}
		}
		
		return -1;
	}
}
