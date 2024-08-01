package strings;

public class S6
{
	public static void main(String[] args)
	{
		String s1="Qspiders";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		String s2="Pune";
		System.out.println(s2);
		System.out.println(s2.hashCode());
		s1=s1+s2;
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		String s3="Qspiders";
		System.out.println(s3.hashCode());
	}
}
