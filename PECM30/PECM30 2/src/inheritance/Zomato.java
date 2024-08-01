package inheritance;

public class Zomato extends FoodApps 
{
	String ceo;
	int cap;
	double sub;
	double share;
	boolean inter;
	
	public Zomato() 
	{
		// TODO Auto-generated constructor stub
	}
	public Zomato(String name,String founder,String origin,double net,
			String ind,String ceo,int cap,double sub,double share,boolean inter)
	{
		super(name,founder,origin,net,ind);
		
		this.ceo=ceo;
		this.cap=cap;
		this.sub=sub;
		this.share=share;
		this.inter=inter;
	}
	public void displayZomato()
	{
		displayFoodApp();
		System.out.println("CEO: "+ceo);
		System.out.println("Captions: "+cap);
		System.out.println("Subscription: "+sub);
		System.out.println("Share Price: "+share);
		System.out.println("Inter-State: "+inter);
		System.out.println("-----------------------------");
	}
}
