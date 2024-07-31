package finalmod;

public class F2 
{
	final static String s; 
	final static double d=45.5;
	static 
	{
		s="Qspiders";
	}
	public static void main(String[] args) 
	{
		//d=45.5; //CTE
		System.out.println(s);
	}
}
