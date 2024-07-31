package array_javaT;

import java.util.Iterator;

public class RemoveDublicate 
{
	public static void main(String[] args) {
		
	
	int array[] = {34, 65, 87, 98, 56, 78, 56, 45, 84, 34}; 
	
	
	for (int i = 0; i < array.length; i++) 
	{
		int count = 0;
		if(array[i]!=0)
		{
			
			for (int j = i+1; j < array.length; j++)
			{
				if(array[i]== array[j])
				{
					count++;
					array[j]=0;
				}
			}
		}
		
		if(count==0 && array[i]!=0)
		{
			System.out.println(" unique elememt in this array is "+ array[i]);
		}
	}
	
	}
}
