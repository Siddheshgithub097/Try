package javaConceptOfDay;

public class ReverseWord_Stringbuffer 
{
	public static void main(String[] args) {
		
		String str = " Siddhesh ";
		
		StringBuffer buffer = new StringBuffer(str).reverse();
		
		System.out.println(buffer);
	}
}
