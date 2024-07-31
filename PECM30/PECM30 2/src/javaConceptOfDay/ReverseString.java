package javaConceptOfDay;

public class ReverseString 

{
	public static void main(String[] args) {
		
		String str =" Siddhesh ";
		
		str = str.toLowerCase();
		
		str = str.trim();
		
		for (int i = str.length()-1; i >= 0; i--) 
		{
			System.out.print(str.charAt(i)+" ");
		}
	}
}
