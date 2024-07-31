package pattern_Programming;

public class PP6 
{
	public static void main(String[] args) 
	{
		 PP6(5);
		PP7(7);
		PP8(8);
	}

	private static void PP6(int n) 
	{
		// for outer loop 
		for (int i = 1; i <= n ; i++) 
		{
			// Inner loop for spaces 
			
			for (int j = n; j > i; j--) 
			{
				System.out.print("  ");
			}
			
			// Inner loop for printing " * " 
			
			for (int k = 1; k <= i; k++) 
			{
				if(k<i)
					{ 
					 System.out.print("* ");
					}
				else
				{
					System.out.println("*");
				}
			}
			
			// for space 
			System.out.println();
		}
		
	}
	 private static void PP7(int n)
	 {
	        // for outer loop
	        for (int i = 1; i <= n; i++) {
	            // Inner loop for spaces
	            for (int j = n; j > i; j--) {
	                System.out.print("  "); // Two spaces
	            }
	            // Inner loop for printing " * "
	            for (int k = 1; k <= i; k++) {
	                if (k < i) {
	                    System.out.print("* "); // Asterisk with space
	                } else {
	                    System.out.print("*"); // Last asterisk without space
	                }
	            }
	            // for space
	            System.out.println();
	        }
	    }
	 
	 public static void PP8(int n)
	 {
		 for (int i = 1; i <= n; i++) 
		 {
			 // space sathi ha loop ghevu 
			 for (int j = n; j > i ; j--) 
			 {
			  System.out.print("  ");	
			 }
			 
			 // Inner loop for printing 
			 
			 for (int k = 1; k <= i; k++) 
			 {
				if(k<i)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("*");
				}
			 }
			 
			 System.out.println();
		 }
	 }
}

/* 
 
 			* 
 		  * *
 		* * *
 	  * * * * 
 	* * * * * 
 */
