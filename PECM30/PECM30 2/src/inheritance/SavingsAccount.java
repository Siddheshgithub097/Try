package inheritance;

public class SavingsAccount  extends Account
{
	double balance;
	double interest;
	double limit;
	double min;
	
	public SavingsAccount()
	{
		
	}
	SavingsAccount(String bank,String branch,long accno,String ifsc,
			String name,double balance,double interest,double limit,double min)
	{
		this.branch=branch;
		this.bank=bank;
		this.accno=accno;
		this.ifsc=ifsc;
		this.name=name;
		
		this.balance=balance;
		this.interest=interest;
		this.limit=limit;
		this.min=min;
		
		System.out.println("Saving Account Created!");
	}
	public void displaySavingsAccount()
	{
		displayAccount();
		
		System.out.println("Balance: "+balance);
		System.out.println("Interest: "+interest);
		System.out.println("Limit: "+limit);
		System.out.println("Min Balance: "+min);
		
		System.out.println("====================================");
	}
}
