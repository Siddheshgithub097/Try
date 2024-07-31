package strings;

import java.util.ArrayList;

public class NewsPaperDriver 
{
	public static void main(String[] args) 
	{
		ArrayList<NewsPaper>n1=new ArrayList<NewsPaper>();
		
		n1.add(new NewsPaper("TOI",new double[] {3,3,3,3,3,5,6}));
		n1.add(new NewsPaper("Hindu",new double[] {2.5,2.5,2.5,2.5,2.5,4,4}));
		n1.add(new NewsPaper("ET",new double[] {4,4,4,4,4,4,10}));
		n1.add(new NewsPaper("Lokmat",new double[] {1.5,1.5,1.5,1.5,1.5,1.5,1.5}));
		n1.add(new NewsPaper("Indian Express",new double[] {2,2,2,2,2,4,4}));
		
		System.out.println(n1);
		createCombination(n1,40);
	}
	public static void createCombination(ArrayList<NewsPaper>n,double budget)
	{
		for(int i=0;i<n.size()-1;i++)
		{
			double sum=0;
			if(n.get(i)!=null)
			{
				for(int j=i+1;j<n.size();j++)
				{
					if(n.get(j)!=null)
					{
						if((n.get(i).total+n.get(j).total)<=budget)
						{
							System.out.println(n.get(i)+","+n.get(j));
						}
					}
				}
			}
		}
	}
}
