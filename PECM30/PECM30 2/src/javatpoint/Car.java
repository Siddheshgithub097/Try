package javatpoint;

public class Car 
{
	int car_Number ;
	String brand ;
	String type ;
	
	public Car(int car_number , String brand , String type )
	{
		this.car_Number= car_number;
		this.brand = brand ;
		this.type= type;
	}

	public void Displaycar()
	{
		System.out.println(" Car Number : "+ car_Number);
		System.out.println(" Brand : "+ brand);
		System.out.println(" Car type : "+ type);
	}
	
	
}
