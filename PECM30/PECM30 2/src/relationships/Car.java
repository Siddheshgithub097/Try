package relationships;

public class Car 
{
	String brand;
	String color;
	double price;
	String type;
	Engine eng;
	
	public Car()
	{
		
	}
	
	Car(String brand,String color,double price,String type)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.type=type;
		
		eng=new Engine("Petrol",1200,91,100,4,4);
	}
	public void displayCar() 
	{
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
		System.out.println("Color: "+color);
		System.out.println("Type: "+type);
		System.out.println("=========================");
	}
}
