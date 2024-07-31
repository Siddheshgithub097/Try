package string_javaT2;

public class ReverseAString 
{
	public static void main(String[] args) 
	{
		String strr = " Siddhesh Pathare ";
		
		for (int i = strr.length()-1; i >= 0; i--) 
		{
			System.out.print(strr.charAt(i)+" ");
		}
	}
}
