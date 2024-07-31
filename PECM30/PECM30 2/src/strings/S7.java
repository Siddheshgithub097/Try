package strings;

public class S7
{
	public static void main(String[] args) 
	{
		char []ch= {'a','b','c'};
		String s=new String(ch);
		System.out.println(s);
		System.out.println("=================");
		String s1=new String("Qspiders");
		System.out.println(s1.hashCode());
		String s2=new String("Pune");
		System.out.println(s2.hashCode());
		s1=s1+s2;
		System.out.println(s1.hashCode());
	}
}
