package pattern_Programming;

public class PP5 
{
	public static void main(String[] args) 
	{
		PP5(6);
	}
	
	public static void PP5(int n )
	{
		// Loop for outer loop 
		
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// Loop for inner loop 
		
		for (int i = n -1; i >= 1; i--) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}

/* 
 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

 
 */ 
