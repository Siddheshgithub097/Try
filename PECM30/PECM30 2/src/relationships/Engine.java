package relationships;

public class Engine
{
	String fuel;
	int cc;
	double bhp;
	int wt;
	int cy;
	int stroke; 
	
	public Engine()
	{
		
	}
	
	Engine(String fuel,int cc,double bhp,int wt,int cy,int stroke)
	{
		this.bhp=bhp;
		this.cc=cc;
		this.fuel=fuel;
		this.wt=wt;
		this.cy=cy;
		this.stroke=stroke;
	}
	public void displayEngine()
	{
		System.out.println("Fuel: "+fuel);
		System.out.println("CC: "+cc);
		System.out.println("Weight: "+wt);
		System.out.println("Cylinder: "+cy);
		System.out.println("Stroke: "+stroke);
		System.out.println("BHP: "+bhp);
		
	}
}
