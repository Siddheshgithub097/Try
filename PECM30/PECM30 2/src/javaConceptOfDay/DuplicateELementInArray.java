package javaConceptOfDay;

public class DuplicateELementInArray 
{
	public static void main(String[] args) {
		
		int array [] = {1,2,3,4,5,4,32,1,2,4,5,6,8,9};
		
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

				if(count!=0)
				{
					System.out.println(array[i]+ " --> "+ count);
				}
			}
			
		}
	}
}
