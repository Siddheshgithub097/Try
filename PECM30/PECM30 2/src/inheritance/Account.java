package inheritance;

public class Account 
{
	String bank;
	String branch;
	long accno;
	String ifsc;
	String name;
	
	public Account()
	{
		
	}
	public Account(String bank,String branch,long accno,
			        String ifsc,String name) 
	{
		this.bank=bank;
		this.branch=branch;
		this.accno=accno;
		this.ifsc=ifsc;
		this.name=name;
		
		System.out.println("Account Created!");
	}
	public void displayAccount()
	{
		System.out.println("Bank: "+bank);
		System.out.println("Branch: "+branch);
		System.out.println("Account No: "+accno);
		System.out.println("IFSC: "+ifsc);
		System.out.println("Name: "+name);
		System.out.println("==================================");
	}
}
