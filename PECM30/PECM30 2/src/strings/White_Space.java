package strings;

public class White_Space
{
	public static void main(String[] args) 
	{
		String str1="Remove white spaces"; 
		
		str1= str1.replaceAll("\\s", "");
		System.out.println(str1);
	}
}
