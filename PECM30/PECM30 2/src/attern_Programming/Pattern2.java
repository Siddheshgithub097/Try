package attern_Programming;

public class Pattern2 
{
	public static void main(String[] args) {
		
		/* 
		 
		 * * * * * *				// first row mdhe 6 column aahe 
		 * * * * *					// second row mdhe 5 column aahe 
		 * * * *
		 * * *
		 * *
		 * 
		 
		 */
		
		for (int i = 1; i <= 6; i++) 
		{
			
			for (int j = 6; j >= i; j--) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
