package polymorphism;

public class PubgUpdate1 extends Pubg
{	
    boolean gun=false;
	
	public void turnRight()
	{
		System.out.println("Turn Right!");
	}
	public void takeGun(String name)
	{
		gun =true;
		bullet +=30;
		System.out.println(name+ " Gun Taken!");
		System.out.println(bullet+ " Magsine Full");
	}
	public void Fire()
	{
		if(gun)
		{
			if (bullet !=0)
			{
				bullet --;
				System.out.println(bullet+ " left");
			}
			else
			{
				System.out.println("Reload");
			}
		}
		else
		{
			System.out.println("No Gun Found");			
		}
	 }
	 public void Reload() 
	 {
		if (gun)
		{
			super.Reload();
			System.out.println("Reload!");
		}
		else
		{
			System.out.println("First Take a Gun Idiot!");
		}
	 }
}
