package array_Pree;

public class UniqueElement 
{
	public static void main(String[] args) 
	{
		int array [] = {12,454,76,6945,4857,46683,23,43,54,65,56,12};
		
		System.out.println(" unique element is ");
		
		for (int i = 0; i < array.length; i++) 
		{
			int count = 0 ;
			if(array[i]!=0)
			{
				
				for (int j = i+1; j < array.length; j++) 
				{
					if(array[i]==array[j])
					{
						count++;
						array[j]=0;
					}
				}
			}
			
			if(count==0 && array[i]!=0)
			{
				System.out.print(array[i]+" ");
			}
		}
	
		}
	}

