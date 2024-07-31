package polymorphism;

public class Pubg 
{
	int bullet;
	
	public void jump()
	{
		System.out.println("Jump 2 Steps");
	}
	public void turnRight()
	{
		System.out.println("Turn Left");
	}
	public void takeGun(String name)
	{
		bullet=30;
		System.out.println(name+ " Gun Picked!");
	}
	public void Fire()
	{
		bullet --;
	}
	public void Reload()
	{
		bullet=30;
	}
	public void turnLeft()
	{
		System.out.println("Turn Left");
	}
	public void Forward()
	{
		System.out.println("1 Step Front");
	}
	public void Backward()
	{
		System.out.println("1 Step Back");
	}
}
