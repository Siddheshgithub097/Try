package javatpoint;

public class CarDrive 
{
	public static void main(String[] args) {
		
		Car car = new Car(1989, " skoda - Slavia ", " 4 wheeler ");
		Car car2 = new Car(1969, " tata-punch ", " 4 Wheeler ");
	
		car.Displaycar();
		
		System.out.println("==================== ");
		
		car2.Displaycar();
		
		System.out.println("==================== ");
		
		System.out.println(" Object is equl ? "+ car.equals(car2));
		
	}
}
