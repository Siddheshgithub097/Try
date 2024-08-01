package string_javaT2;

public class Binarysearch 
{
	public static void main(String[] args) {
		
		
		int array [] = {2 ,5,7,9,12,14 ,16,17,19,20,24,28};
		
		int search = 12 ;
		int lowerindex = 0;
		int higherindex = array.length-1;
		int middleindex = (lowerindex+higherindex)/2;
		
		
		while (lowerindex<=higherindex)
		{
				if(array[middleindex]==search)
				{
					System.out.println(" element is at "+middleindex+" index position ");
					break;
				}
				
				else if(array[middleindex]<search)
				{
					
					lowerindex= middleindex+1;
				}
				else
				{
					higherindex = middleindex-1;
				}
			
				middleindex = (lowerindex+higherindex)/2;
		}
		
		if(lowerindex>higherindex)
		{
			System.out.println(" element not found ");
		}
		
	}
	
}
