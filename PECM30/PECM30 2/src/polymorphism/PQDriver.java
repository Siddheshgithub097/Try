package polymorphism;

public class PQDriver 
{
	public static void main(String[] args) 
	{
		P p1=new Q();
		
		p1.best();
		
		p1.worst();
		
		System.out.println(p1.non);
		System.out.println(p1.s);
	}
}
