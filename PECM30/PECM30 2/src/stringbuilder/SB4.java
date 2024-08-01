package stringbuilder;

public class SB4 
{
	public static void main(String[] args) 
	{
		String s1="Pune";
		StringBuilder sb1=new StringBuilder(s1);
		System.out.println(sb1);
		String s2=new String(sb1);
		System.out.println(s2);
	}
}
