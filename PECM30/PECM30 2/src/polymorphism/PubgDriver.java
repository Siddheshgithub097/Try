package polymorphism;

public class PubgDriver 
{
	public static void main(String[] args) 
	{
		Pubg p1=new Pubg();
		
		p1.jump();
		p1.Fire();
		p1.turnRight();
		p1.Reload();
		
		System.out.println("=======================");
		
		Pubg p2=new PubgUpdate1();
		p2.jump();
		p2.turnRight();
		p2.takeGun("M24");
		p2.Fire();
		p2.Fire();
		p1.Reload();
	}
}
