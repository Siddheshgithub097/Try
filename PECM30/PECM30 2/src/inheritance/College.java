package inheritance;

public class College extends University
{
	String colname;
	String colloc;
	String principle;
	int colcode;
	String naac;
	String type;
	
	public College()
	{
		
	}
	College(String uniname,int unicode,String uniloc,String vc,String colname,
			String colloc,String principle,int colcode,String naac,String type)
	{
		super(uniname,unicode,uniloc,vc); //super call statement 
		
		this.colname=colname;
		this.colloc=colloc;
		this.principle=principle;
		this.colcode=colcode;
		this.naac=naac;
		this.type=type;
	}
	public void displayCollege()
	{
		displayUniversity();
		
		System.out.println("College Name: "+colname);
		System.out.println("College Loc: "+colloc);
		System.out.println("College Principle: "+principle);
		System.out.println("College Code: "+colcode);
		System.out.println("NAAC Grade: "+naac);
		System.out.println("College Type: "+type);
		System.out.println("=====================================");
	}
}
