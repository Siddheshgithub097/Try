package array_javaT;

public class Rotate_Element1 
{
public static void main(String[] args) {
		
		int array [] = new int [] {1,2,3,4,5};
		int n = 3;
		
		System.out.println(" orignal array ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+ " ");
		}
		
		System.out.println(" after rotating array ");
		
		for (int i = 0; i < n; i++) 
		{
			int j , first ;
			
			first= array[0];
			
			for (j = 0; j < array.length-1; j++) 
			{
				array[j]= array[j+1];
			}
			
			array[j]= first;
		}
		
System.out.println();
		
		System.out.println(" after rotating array ");   		
		for (int i = 0; i < array.length; i++) 
		{
			System.out.print(array[i] +" ");
		}
		
}
}
