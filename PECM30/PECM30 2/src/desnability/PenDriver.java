package desnability;

import java.util.Scanner;

public class PenDriver 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Bag b=new Bag();
		for(;;)
		{
			System.out.println("1.addpen 2.remove 3.display 4.exit");
		    switch(sc.nextInt())
		    {
		    case 1:
		    {
		    	b.addPen();
		    	break;
		    }
		    case 2:
		    {
		    	b.removePen();
		    	break;
		    }
		    case 3:
		    {
		    	b.displayPen();
		    	break;
		    }
		    case 4:
		    {
		    	System.err.println("Application is Stopped!");
		    }
		    }
		}
	}
}
