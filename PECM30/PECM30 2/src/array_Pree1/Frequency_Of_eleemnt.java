package array_Pree1;

public class Frequency_Of_eleemnt 
{
	public static void main(String[] args) 
	{
		int array [] = {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
		
		for (int i = 0; i < array.length; i++) 
		{
			int count =1;
			if(array[i]!=0)
			{
				for (int j = i+1 ; j < array.length; j++) 
				{
					if(array[i]==array[j])
					{
						count++;
						array[j]=0;
					}
				}
			}
			 if(count!=1)
			{
				System.out.println(" Element " +array[i] +" occurs " + count +" times ");
			}
		}
	}
}
