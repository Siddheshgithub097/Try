package strings;

public class NewsPaper 
{
	String name;
	double price[];
	double total;
	
	public NewsPaper() 
	{
		
	}

	public NewsPaper(String name, double[] price) 
	{
		super();
		this.name = name;
		this.price = price;
		this.total = totalPrice();
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
	@Override
	public String toString() 
	{
		return "[name: "+name+", Total: "+total+"]";
	}
}
