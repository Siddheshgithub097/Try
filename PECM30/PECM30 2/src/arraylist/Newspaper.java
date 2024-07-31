package arraylist;

public class Newspaper 
{
	String name;
	double price[];
	double total;
	
	public Newspaper()
	{

	}
	public Newspaper(String name,double[] price)
	{
		this.name=name;
		this.price=price;
		this.total=totalPrice();
	}
	public String toString()
	{
		return "[Name= "+name+",Total Price= "+total+"]";
	}
	public double totalPrice()
	{
		double sum=0;
		for(int i=0;i<price.length;i++)
		{
			sum=sum+price[i];
		}
		return sum;
	}
}
