package array_Pree1;

public class Dublicate_First 
{
	public static void main(String[] args) 
	{
		int array [] = {34,65,87,98,56,78,56,45,87,34};
		
		for (int i = 0; i < array.length; i++) 
		{
			int count = 0 ;
			if(array[i]!=0)
			{
				for (int j = i+1 ; j < array.length; j++) 
				{
					if(array[i]==array[j])
					{
						count ++;
						array[j]=0;
					}
				}
			}
			
			if(count!=0)
			{
				System.out.println(array[i] +" is the first dublicate of an array ");
				return;
			}
		}
	}
}
