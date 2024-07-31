package interfaces;

public abstract class InstaImp1 implements Instagram 
{
	String name;
	int pwd;
	
	public InstaImp1()
	{
		
	}
	InstaImp1(String name,int pwd)
	{
		this.name=name;
		this.pwd=pwd;
		
		System.out.println("Account Created!");
	}
	public void post(String s)
	{
		System.out.println(s);
		System.out.println("Posted!");
	}
	public void comment(String cmt,String name)
	{
		System.out.println(cmt);
		System.out.println(name+" Commented!");
	}
	public void follow(String name)
	{
		System.out.println(name+" Started Following You!");
	}
	public void like(String name)
	{
		System.out.println(name+" liked the post!");
	}
	public void login(String name,int pwd)
	{
		System.out.println("Logged in!");
	}
}

