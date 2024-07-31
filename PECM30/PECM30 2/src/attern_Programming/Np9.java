package attern_Programming;

public class Np9 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <=7; i++)
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		//Printing lower half of the pattern
		
		for (int i =7-1; i >=1; i--) 
		{
			for (int j = 1; j <=i; j++) 
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
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */
