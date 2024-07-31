package pattern_Programming_Number_star;

public class NumberPattern3 
{
	public static void main(String[] args) {
		
		/* 
		 
		 1
		 2 1
		 3 2 1
		 4 3 2 1
		 5 4 3 2 1
		 
		 */
		
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = i; j >= 1; j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("=====================");
		
		for (int i = 1; i <= 5; i++) 
		{
			
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
