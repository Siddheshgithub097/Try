package arraylist;

public class Pen 
{
	String brand;
	double price;
	String type;
	String color;
	double size;
	
	public Pen()
	{
		
	}
	public Pen(String brand,double price,String type,String color,double size) 
	{
		this.brand=brand;
		this.price=price;
		this.type=type;
		this.color=color;
		this.size=size;
	}
	public String toString()
	{
		return "[Brand= "+brand+",Color= "+color+"]";
	}
}
