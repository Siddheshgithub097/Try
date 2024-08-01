package array_Pree1;

public class FrequencyOf 
{
	public static void main(String[] args) 
	{
		
	
		int arr [] = {1, 2, 8, 3, 12, 2, 2, 5, 1}; 
		
		for (int i = 0; i < arr.length; i++) 
		{
			int count = 1;
			if(arr[i]!=0)
			{
				for (int j = 1; j < arr.length; j++) 
				{
					if(arr[i]==arr[j])
					{
						count ++;
					}
				}
				
				if(count!=1)
				{
					System.out.println(" Element " +arr[i] +" occurs " + count +" times ");
				}
			}
		}
	}
}
