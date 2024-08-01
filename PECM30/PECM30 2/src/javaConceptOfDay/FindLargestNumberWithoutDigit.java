package javaConceptOfDay;

public class FindLargestNumberWithoutDigit
{
	public static void main(String[] args) 
	{
		System.out.println(findLargestNumberWithoutDigit(4582, 5));
	}
	
	public static int findLargestNumberWithoutDigit(int number , int DigitToAvoid)
	{
		// first i will convert either char , or string 
		
		String avoidDigit = Integer.toString(DigitToAvoid);
		
		// than i will use for loop for finding the digit 
		
		// for loop start from last to first bcz we want to findout largestlessthan number 
		
		for (int i = number ; i >= 0; i--)
		{
			// if(Integer.toString(i).indexOf(avoidDigit)==-1)	// we can also use 
			if(!Integer.toString(i).contains(avoidDigit))
			{
					return i ;
			}
			
		}
		
		return -1 ;
	}
}
