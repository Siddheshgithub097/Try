package javaConceptOfDay;

public class ReverseString_Stringbuilder 
{
	public static void main(String[] args) {
		
		String str =" shweta ";
		
		StringBuilder builder = new StringBuilder(str).reverse();
		
		System.out.println(builder);
		
		
	}
}
