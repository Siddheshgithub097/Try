package stringbuilder;

public class SB3 
{
	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder("Qspiders");
		StringBuilder sb2=new StringBuilder("Deccan");
		StringBuilder sb3=sb1.append(sb2);
		System.out.println(sb1);
		System.out.println(sb3);
		
		String str1="Jspiders";
		String str2="Deccan";
		
		String str3=str1.concat(str2);
		System.out.println(str1);
		System.out.println(str3);
	}
}
