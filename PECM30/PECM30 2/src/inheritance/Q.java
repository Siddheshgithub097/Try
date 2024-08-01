package inheritance;

public class Q extends P
{
	String i="Qspiders";
	
	public void test()
	{
		System.out.println("From Class Q");
	}
	public void display()
	{
		System.out.println(super.i);
		super.test();
	}
}
