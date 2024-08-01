package desnability;

import java.util.Scanner;

public class Bag 
{
	Pen p;
	Scanner sc=new Scanner(System.in);
	public void addPen()
	{
		if(p==null)
		{
			System.out.println("Enter pen name");
			String penname=sc.next();
			System.out.println("Enter pen color");
			String pencolor=sc.next();
			System.out.println("Enter pen price");
			double penprice=sc.nextDouble();
			p=new Pen(penname,pencolor,penprice);
			System.out.println("Pen Added!");
		}
		else
		{
			System.out.println("Already Pen is Existing!");
		}
	}
	public void removePen()
	{
		if(p==null)
		{
			System.out.println("Please Add Pen First!");
		}
		else
		{
			p=null;
			System.out.println("Pen is Removed!");
		}
	}
	public void displayPen()
	{
		if(p==null)
		{
			System.out.println("Please Add Pen First!");
		}
		else
		{
			System.out.println(p.penName);
			System.out.println(p.penColor);
			System.out.println(p.penPrice);
		}
	}
}
