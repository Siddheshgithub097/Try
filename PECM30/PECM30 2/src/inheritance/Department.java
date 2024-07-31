package inheritance;

public class Department extends College
{
	String name;
	String hod;
	int std;
	int lec;
	
	public Department()
	{
		
	}
	Department(String uniname,int unicode,String uniloc,String vc,String colname,
			String colloc,String principle,int colcode,String naac,String type,
			String name,String hod,int std,int lec)
	{
		super(uniname,unicode,uniloc,vc,colname,colloc,principle,colcode,naac,type);
		
		this.name=name;
		this.hod=hod;
		this.std=std;
		this.lec=lec;
	}
	public void displayDepartment()
	{
		displayCollege();
		
		System.out.println("Dept Name: "+name);
		System.out.println("Dept HOD: "+hod);
		System.out.println("No.of Students: "+std);
		System.out.println("No.of Lectures: "+lec);
		System.out.println("=================================");
	}
}
