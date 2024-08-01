package javaConceptOfDay;

public class EqulityOftwoArray 
{
	public static void main(String[] args) 
	{
		int[] arrayOne = {2, 5, 1, 7, 4};
        
        int[] arrayTwo = {2, 5, 1, 7, 4};
        
        boolean flag = true;
        		
        if(arrayOne.length!=arrayTwo.length)
        {
        	flag = false;
        }
        else
        {
        
	        for (int i = 0; i < arrayOne.length; i++) 
	        {
	        	if(arrayOne[i]!=arrayTwo[i])
	        	{
	        		flag = false;
	        		break;
	        	}
			}
        }
        
        if(flag)
        {
        	System.out.println("Array1 and Array2 are equal:" );
        }
        else
        {
        	System.out.println("Array1 and Array2 are not equal:" );        }
	}
}
