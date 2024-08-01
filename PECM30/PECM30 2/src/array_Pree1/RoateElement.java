package array_Pree1;

public class RoateElement 
{
	public static void main(String[] args) 
	{
		int array [] = {1,2,3,4,5,6};
		
		int n =4;
		
		System.out.println(" before rotating element ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
		
		// so i want rotate array in 3 times 
		
		for (int i = 0; i < n; i++) 
		{
			int j , first;
			
			first = array[0];
			
			for ( j = 0; j < array.length-1; j++) 
			{
				array[j] = array[j+1];
			}
			
			array[j]= first;
		}
		
		System.out.println();
		System.out.println(" after rotating element ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
	}
}
