package javaConceptOfDay;

public class PairsOfelement 
{
	public static void main(String[] args) 
	{
		FindAllPairOfelement(new int [] {12,2,3,4,5,24,6,7,13}, 10);
		
	}
	
	public static void FindAllPairOfelement(int array [], int Target)
	{
		
		for (int i = 0; i < array.length; i++) 
		{
			
			for (int j = i+1; j < array.length; j++) 
			{
				if(array[i]+array[j]==Target)
				{
					System.out.println(array[i]+" + "+ array[j]+" = "+ Target);

				}
			}
		}
	}
}
