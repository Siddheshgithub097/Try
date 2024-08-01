package javaConceptOfDay;

public class RemoveWhiteSpace 
{
	public static void main(String[] args) {
		
		String str =" Siddhesh Pathare ";
		
		String strrr = str.replaceAll("\\s", "");
		
		System.out.println(" Orignal String "+ str);
		System.out.println(" After Removing white Space :"+ strrr);
		
		
	}
}
