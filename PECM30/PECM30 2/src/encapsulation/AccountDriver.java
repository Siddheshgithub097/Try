package encapsulation;

public class AccountDriver
{
	public static void main(String[] args) 
	{
		Account a1=new Account("ICICI Bank",123456789l,"ICIUCUC332",
				"Deccan","Vinay Mallya",500000.00,1234,"Savings",987654321l);
		System.out.println(a1.getBalance(3234234,1234));
		System.out.println(a1.getBank());
		a1.withdraw(100.00,123456789l,1234);
		a1.setPin(123456789l,1234,5678);
		a1.deposite(123456789l,5678,2000.00);

	}
}
