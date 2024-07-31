package inheritance;

public class University
{
	String uniname;
	int unicode;
	String uniloc;
	String vc;
	
	public University() 
	{
		
	}
	University(String uniname,int unicode,
			String uniloc,String vc)
	{
		this.uniloc=uniloc;
		this.unicode=unicode;
		this.uniname=uniname;
		this.vc=vc;
	}
	public void displayUniversity()
	{
		System.out.println("University Code: "+unicode);
		System.out.println("University Name: "+uniname);
		System.out.println("University Loc: "+uniloc);
		System.out.println("Vice Chancellar: "+vc);
		System.out.println("==================================");
	}
}
