package array_Pree;

// Write a java program to create an array and print the length of an array using a for loop.

public class Print_lenth_ofarray_forloop 
{
	public static void main(String[] args) 
	{
		String s1 [] = {"sid", "viky" , "Maya" ,"Monish" ,"Viku"};
		
		for (int i = 0; i < s1.length; i++) 
		{
			System.out.println(s1[i] + " ");
		}
		
		System.out.println(" ==================================================== ");
		
		String s12 []= {"Pritu" , "Pree" , "Muski" , "Rabbit"};
		
		for(int i=0; i<s12.length ; i++)
		{
			System.out.println(s12[i]);
		}
		
		System.out.println(" ==================================================== ");

		int ar []= {1,2,3,4,5,6,7};
		
		for(int i=0 ; i<ar.length; i++)
		{
			System.out.println(ar[i]);
			
		}
		
	}
}
