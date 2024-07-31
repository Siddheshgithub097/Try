package inheritance;

public class FoodApps 
{
	String name;
	String founder;
	String origin;
	double net;
	String ind;
	
	public FoodApps() 
	{
		// TODO Auto-generated constructor stub
	}
	FoodApps(String name,String founder,String origin,double net,String ind)
	{
		this.founder=founder;
		this.name=name;
		this.net=net;
		this.ind=ind;
		this.origin=origin;
	}
	public void displayFoodApp()
	{
		System.out.println("Name: "+name);
		System.out.println("Founder: "+founder);
		System.out.println("Net Worth: "+net);
		System.out.println("Industry: "+ind);
		System.out.println("Origin: "+origin);
	}
}
