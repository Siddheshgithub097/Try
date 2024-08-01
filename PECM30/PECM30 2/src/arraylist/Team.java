package arraylist;

import java.util.Arrays;

public class Team 
{
	String name;
	int pts;
	char [] results;
	
	public Team() 
	{
		
	}

	public Team(String name, int pts, char[] results) 
	{
		super();
		this.name = name;
		this.pts = pts;
		this.results = results;
	}

	@Override
	public String toString() 
	{
		return "Team [name=" +name+ ", pts=" +pts+ ", results=" +Arrays.toString(results)+ "]";
	}
}
