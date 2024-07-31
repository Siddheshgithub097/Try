package stringbuilder;

public class SB1 
{
	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder("Hello");
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("Hello");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}
}
