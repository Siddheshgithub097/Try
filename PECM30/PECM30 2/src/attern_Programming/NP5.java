package attern_Programming;

public class NP5 
{
	public static void main(String[] args) 
	{
		for (int i = 7; i >=1; i++) 
		{
			for (int j = 1; j >=i; j++) 
			{
				System.out.print(i +" ");
			}
			System.out.println();
		}
	}
}

/* 
	7
	7 6
	7 6 5
	7 6 5 4
	7 6 5 4 3
	7 6 5 4 3 2
	7 6 5 4 3 2 1
 */
