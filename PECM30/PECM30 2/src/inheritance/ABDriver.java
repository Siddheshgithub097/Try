package inheritance;

public class ABDriver 
{
	public static void main(String[] args) 
	{

		A a1=new A();
		
		System.out.println(a1.a);
		a1.displayA();
	//	a1.displayB(); //CTE
		
		B b1=new B();
		b1.displayB();
		b1.displayA();
	}
}
