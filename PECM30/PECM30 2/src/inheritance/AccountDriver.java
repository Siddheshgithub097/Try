package inheritance;

public class AccountDriver
{
	public static void main(String[] args) 
	{
		SavingsAccount s1=new SavingsAccount("SBI","Deccan",987654321l,"SBI2345",
				"Babu Rao",540000.00,3,200000.0,3000.00);
		s1.displayAccount();
	}
}
