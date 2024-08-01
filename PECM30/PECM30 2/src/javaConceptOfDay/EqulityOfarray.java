package javaConceptOfDay;

import java.util.Arrays;

public class EqulityOfarray
{
	public static void main(String[] args) {
		
		 String[] s1 = {"java", "j2ee", "struts", "hibernate"};
		 
	     String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
	 
	     String[] s3 = {"java", "j2ee", "struts", "hibernate"};
	     
	 /*    System.out.println(Arrays.equals(s1, s2));
	     System.out.println(Arrays.equals(s1, s3));
	     
	   */
	     
	     boolean isequl = Arrays.equals(s1, s2);
	     boolean isequl2 = Arrays.equals(s1, s3);
	     
	     System.out.println("Array1 and Array2 are equal: " + isequl);
	     System.out.println("Array1 and Array2 are equal: " + isequl2);
	}
}
