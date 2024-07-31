package array_javaT2;

public class RemoveAll_WhiteSpaces 
{
	public static void main(String[] args) {
		
	
	 String str1="Remove white spaces";    
	 
	 str1 = str1.replaceAll("\\s+", "");
	 
	 System.out.println(" after removing white spaces --->"+ str1);
}
}