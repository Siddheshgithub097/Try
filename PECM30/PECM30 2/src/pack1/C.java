package pack1;

public class C 
{
	static double d=456.45;
	static void test()
	{
		System.out.println("From default static test() of class C");
	}
	C()
	{
		
	}
	void demo()
	{
		System.out.println("From default non-static demo() of class C");
	}
	public static void main(String[] args) 
	{
		C c1=new C();
		c1.demo();
		C.test();
	}
}
