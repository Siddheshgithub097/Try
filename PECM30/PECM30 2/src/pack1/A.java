package pack1;

public class A 
{
	private static int a=100;
	private char ch='t';
	
	private A()
	{
		
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(new A().ch);
	}
}
