package arraylist;

import java.util.ArrayList;

public class PenStand 
{
	public static void main(String[] args) 
	{
		ArrayList stand=new ArrayList();
		stand.add(new Pen("Cello",10,"BallPoint","Blue",0.5));
		stand.add(new Pen("Reynolds",20.0,"Gel","Black",0.7));
		stand.add(new Pen("Trimax",50.0,"Gel","Blue",0.5));
		stand.add(new Pen("Parker",500.0,"Ink","Black",0.7));
		
		stand.add(new Pencil("Natraj",5,"Extra Dark","Black"));
		stand.add(new Pencil("Apsara",7,"2HB","Grey"));
		stand.add(new Pencil("Camline",10,"6B","Black"));

		System.out.println(stand);
		for(int i=0;i<stand.size();i++)
		{
			if(stand.get(i) instanceof Pen)
			{
				Pen p=(Pen) stand.get(i);
				if(p.color.equalsIgnoreCase("Black"))
				{
					System.out.println("remove"+p);
					stand.remove(p);
				}
			}
			else if(stand.get(i) instanceof Pencil)
			{
				Pencil p=(Pencil) stand.get(i);
				if(p.color.equalsIgnoreCase("Black"))
				{
					System.out.println("remove"+p);
					stand.remove(p);
				}
			}
		}
		System.out.println(stand);
	}
}
