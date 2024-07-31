package array_javaT2;

public class First_Second_Maximum 
{
	public static void main(String[] args) 
	{
		int array [] = {12,74,6,7,8,9,12,43,76,736,3463,735,23,43,23,65,65,56,65,56};
		
		int firstmax = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for (int i = 1 ; i < array.length; i++) 
		{
			if(firstmax<array[i])
			{
				secMax = firstmax;
				firstmax= array[i];
			}
			else if (secMax<array[i])
			{
				secMax= array[i];
			}
		}
		
		System.out.println(" first maximum value is "+ firstmax);
		System.out.println(" second maximum value is "+ secMax);
	}

}
