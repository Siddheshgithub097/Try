package pattern_Programming;

public class PP3 
{
	public static void main(String[] args) 
	{
		PP3(5);
		
		NumberPattern(5);
		
		NumberPattern2(5);
	}


public static void PP3(int n )
{
	
	for (int row = 1; row <= n; row++) 
	{
		for (int col = 5; col >= row; col--) 
		{
			System.out.print("* ");
		}
		
		// bcz i need a space 
		System.out.println();
		
	}
}

public static void NumberPattern(int n )
{
	System.out.println("====================== ");
	System.out.println();
	
	for (int i = 1; i <= n; i++) 
	{
		for (int j = 1; j <= n-i+1; j++) 
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}

}

public static void NumberPattern2(int n )
{
	System.out.println("====================== ");
	System.out.println();
	for (int i = 1; i <= n; i++) 
	{
		for (int j = 5; j >= i; j--) 
		{
			System.out.print(j+" ");
		}
		System.out.println();
	}

}
}

/* 


*  *  *  *  * (r1 = 5col)
*  *  *  *    (r2 = 4col)
*  *  *  	  (r3 = 3col)
*  *  		  (r4 = 2col)
*     		  (r5 = 1col)

*/

/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

 
 

5 4 3 2 1 
5 4 3 2
5 4 3 
5 4 
5 

*/

