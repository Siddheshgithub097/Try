package arrays;

public class BigegstValue 
{
	public static void main(String[] args)
	{
		
		int array [] = {3434,5256,43236,345134,4524,63546,25545};
		
		int max= array[0];
		for (int i = 1; i < array.length; i++) 
		{
			if(max<array[i])
			{
				max=array[i];
			}
		}
		
		System.out.println(" Biggest Value is "+ max);
	
	}
}
