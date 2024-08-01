package inheritance;

public class PQDriver 
{
	public static void main(String[] args)
	{
		Q q1=new Q();
		
		q1.display();
		System.out.println(q1 instanceof P);
		
		P p1=new P();
		
		System.out.println(p1 instanceof Q);
	}
}
