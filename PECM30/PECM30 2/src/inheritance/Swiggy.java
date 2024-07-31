package inheritance;

public class Swiggy extends FoodApps 
{
	String ceo;
	int cap;
	double sub;
	
	public Swiggy() 
	{
		// TODO Auto-generated constructor stub
	}
	public Swiggy(String name,String founder,String origin,double net,
			String ind,String ceo,int cap,double sub)
	{
		super(name, founder, origin, net, ind);
		
		this.ceo=ceo;
		this.cap=cap;
		this.sub=sub;
	}
	public void displaySwiggy()
	{
		displayFoodApp();
		
		System.out.println("CEO: "+ceo);
		System.out.println("Captions: "+cap);
		System.out.println("Subscription: "+sub);
	}
}
