package array_javaT2;

public class Binary_Search 
{
	public static void main(String[] args) 
	{
		int array [] = {2 ,5,7,9,12,14 ,16,17,19,20,24,28};
															// ha tevha ch work hoto jevha aapn array ha sort kelala asto ;
		int search = 28 ;
		int lowerIndex = 0 ;
		int higherIndex = array.length-1 ;
		int middleIndex = (lowerIndex+higherIndex)/2 ; 
		
		while(lowerIndex<=higherIndex)
		{
			if(array[middleIndex]==search)
			{
				System.out.println(" element is at "+ middleIndex+" index position ");
				break;
			}
			else if(array[middleIndex]<search)
			{
				lowerIndex = middleIndex+1;
			}
			else
			{
				higherIndex = middleIndex-1;
			}
			
			middleIndex = (lowerIndex+higherIndex)/2 ; 
		}
		
		if(lowerIndex>higherIndex)
		{
			System.out.println(" element not found ");
		}
	}
}
