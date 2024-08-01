package array_javaT;

public class Rotate_element_right 
{
	public static void main(String[] args) {
		
		int array [] = new int [] {1,2,3,4,5};
		
		System.out.println(" before rotating element in array ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+ " ");
		}
		
		int n=3;
		for (int i = 0; i < n; i++) 
		{
			
			int rotate,j;
			
			rotate=array[0];
			for ( j = 0; j < array.length-1; j++) 
			{
				array[j] = array[j+1];
			}
			
			array[j]=rotate;
		}
		
		System.out.println();
		System.out.println(" after rotating element in array ");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]+ " ");
		}
		
	}
}
