package inheritance;

public class FatherSonDriver 
{
	public static void main(String[] args)
	{
		Son s1=new Son();
		
		s1.drinking();
		s1.smoking();
		
		Father f1=s1;  //upcasting
		f1.drinking();
	//	f1.smoking(); //CTE
	}
}
