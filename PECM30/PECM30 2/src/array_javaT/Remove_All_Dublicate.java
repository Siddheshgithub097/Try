package array_javaT;

public class Remove_All_Dublicate {

	public static void main(String[] args)
	{
		int array [] = {12,43,76,736,3463,735,23,43,23,65,65,56,65,56};
		
		System.out.println(" before unique element our array is - ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print (array[i]+" ");
		}
		System.out.println();
		
		System.out.println(" All unique element ");
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
				
				if(count==0)
				{
					System.out.print(array[i]+ " ");
				}
			}
		}

	}

}
