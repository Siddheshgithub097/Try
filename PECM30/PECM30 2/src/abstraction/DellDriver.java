package abstraction;

public class DellDriver 
{
	public static void main(String[] args) 
	{
		Dell d1=new Windows();
		d1.welcome("Raju");
		d1.OS();
		
		Dell d2=new Linux();
		d2.welcome("Kaju");
		d2.OS();
	}
}
