package arraylist;

public class Pencil 
{
	String brand;
	double price;
	String type;
	String color;
	public Pencil()
	{
		
	}
	public Pencil(String brand,double price,String type,String color)
	{
		this.brand=brand;
		this.price=price;
		this.type=type;
		this.color=color;
	}
	public String toString()
	{
		return "[Brand= "+brand+",Color= "+color+"]";
	}
}
