package array_javaT2;

public class Rotating_Element
{
	public static void main(String[] args) {
		int array [] = {1,2,3,4,5,6};
		int n = 3; 
		
		System.out.println(" orignal array ");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]+" ");
		}
		
		System.out.println(" after rotating array ");
		
		for (int i = 0; i < n ; i++) 
		{
			int j , first ;
			first = array[0];
			
			for (j = 0;  j< array.length-1; j++) 
			{
				array[j]= array[j+1];
			}
			
			array[j] = first;
		}
		
		System.out.println();
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+" ");
		}
	}
}
