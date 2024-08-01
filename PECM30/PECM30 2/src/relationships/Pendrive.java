package relationships;

public class Pendrive 
{
	String name;
	int size;
	double price;
	
	public Pendrive()
	{
		
	}
	
	Pendrive(String name,int size,double price)
	{
		this.name=name;
		this.size=size;
		this.price=price;
	}
	public void displayPendrive()
	{
		System.out.println("Brand: "+name);
		System.out.println("Price: "+price);
		System.out.println("Size: "+size);
		System.out.println("=========================");
	}
}
