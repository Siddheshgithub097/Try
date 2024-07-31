package pattern_Programming_Number_star;

public class Numberpattern2_1
{
	public static void main(String[] args) 
	{
		/*
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1
	 */
		
		int row = 7;
		for (int i = 0; i <= row; i++) 
		{
			for (int j = 1; j <= row-i; j++) 
			{
				
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("==================================");
		NumberPattern2();
	}
	
	public static void NumberPattern2()
	{
		System.out.println();
		
		for (int i = 7; i >= 1; i--) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
	}
}
